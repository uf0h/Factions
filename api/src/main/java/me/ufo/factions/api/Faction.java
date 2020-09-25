package me.ufo.factions.api;

import java.time.Instant;
import java.util.HashMap;
import java.util.Set;
import java.util.UUID;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectOpenHashSet;
import org.bukkit.Location;

public interface Faction<T extends Faction<T>> {

  UUID getUniqueId();

  String getTag();

  String getDescription();

  Location getHome();

  ObjectOpenHashSet<UUID> getMembers();

  UUID getLeader();

  ObjectOpenHashSet<UUID> getAllPlayers();

  ObjectOpenHashSet<T> getAlliances();

  ObjectOpenHashSet<T> getEnemies();

  Instant getLastOnline();

  Location getClaimAt(final int x, final int z);

  ObjectOpenHashSet<int[]> getClaims();

  Object2ObjectOpenHashMap<String, Location> getWarps();

}
