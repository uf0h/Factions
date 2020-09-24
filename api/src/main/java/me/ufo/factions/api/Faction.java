package me.ufo.factions.api;

import java.time.Instant;
import java.util.List;
import java.util.UUID;
import org.bukkit.Location;

public interface Faction {

  UUID getUniqueId();

  String getTag();

  String getDescription();

  Location getHome();

  List<UUID> getMembers();

  List<UUID> getModerators();

  List<UUID> getColeaders();

  UUID getLeader();

  List<Faction> getAlliances();

  List<Faction> getEnemies();

  Instant getLastOnline();

  Location getClaimAt(final int x, final int z);

  List<int[]> getClaims();

}
