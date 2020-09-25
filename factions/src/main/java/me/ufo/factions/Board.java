package me.ufo.factions;

import com.google.common.base.Preconditions;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import org.bukkit.Location;

public final class Board implements me.ufo.factions.api.Board<Faction> {

  private boolean loaded;
  /* TODO: check other options + custom location obj, faster hashs */
  private static final Object2ObjectOpenHashMap<Location, Faction> locations = new Object2ObjectOpenHashMap<>();

  public Board() {
    this.load();
  }

  @Override
  public int load() {
    Preconditions.checkArgument(!loaded, "The faction board is already loaded.");

    loaded = true;
    return 0;
  }

  @Override
  public boolean saveFaction(final Faction faction) {
    return false;
  }

  @Override
  public boolean deleteFaction(final Faction faction) {

    return false;
  }

  @Override
  public Faction getFaction(final String tag) {
    return null;
  }

  @Override
  public Faction getFactionAt(final int x, final int z) {
    return null;
  }

  @Override
  public Faction getFactionAt(final Location location) {
    return locations.get(location);
  }

  @Override
  public Object2ObjectOpenHashMap<Location, Faction> getFactions() {
    return locations;
  }

}
