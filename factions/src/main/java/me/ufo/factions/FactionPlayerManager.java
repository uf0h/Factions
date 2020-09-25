package me.ufo.factions;

import java.util.UUID;
import com.google.common.base.Preconditions;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;

public final class FactionPlayerManager implements me.ufo.factions.api.FactionPlayerManager<Faction> {

  private boolean loaded;
  private static final Object2ObjectOpenHashMap<UUID, FactionPlayer> players = new Object2ObjectOpenHashMap<>();

  @Override
  public boolean load() {
    Preconditions.checkArgument(!loaded, "The faction player manager is already loaded.");

    loaded = true;
    return false;
  }

  public static Object2ObjectOpenHashMap<UUID, FactionPlayer> getPlayers() {
    return players;
  }

}
