package me.ufo.factions.api;

import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import org.bukkit.Location;

public interface Board<T extends Faction<T>> {

  int load();

  boolean saveFaction(final T faction);

  boolean deleteFaction(final T faction);

  T getFaction(final String tag);

  T getFactionAt(final int x, final int z);

  T getFactionAt(final Location location);

  Object2ObjectOpenHashMap<?, T> getFactions();

}
