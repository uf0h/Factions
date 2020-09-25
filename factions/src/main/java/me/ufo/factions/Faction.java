package me.ufo.factions;

import java.time.Instant;
import java.util.UUID;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectOpenHashSet;
import org.bukkit.Location;

public final class Faction implements me.ufo.factions.api.Faction<Faction> {

  private final UUID uniqueId;
  private String tag;
  private String description;
  private Location home;

  /* MEMBERSHIP */
  private final ObjectOpenHashSet<UUID> members = new ObjectOpenHashSet<>();
  private UUID leader;

  /* RELATIONS */
  private final ObjectOpenHashSet<Faction> alliances = new ObjectOpenHashSet<>();
  private final ObjectOpenHashSet<Faction> enemies = new ObjectOpenHashSet<>();

  private Instant lastOnline = Instant.now();

  /* WARPS TODO: obj w/ password instead of bukkit Location obj */
  private final Object2ObjectOpenHashMap<String, Location> warps = new Object2ObjectOpenHashMap<>(4);

  public Faction(final UUID leader, final String tag) {
    this.uniqueId = leader;
    this.leader = leader;
    this.tag = tag;
  }

  @Override
  public UUID getUniqueId() {
    return this.uniqueId;
  }

  @Override
  public String getTag() {
    return this.tag;
  }

  public void setTag(final String tag) {
    this.tag = tag;
  }

  @Override
  public String getDescription() {
    return this.description;
  }

  public void setDescription(final String description) {
    this.description = description;
  }

  @Override
  public Location getHome() {
    return this.home;
  }

  public void setHome(final Location home) {
    this.home = home;
  }

  @Override
  public ObjectOpenHashSet<UUID> getMembers() {
    return this.members;
  }

  public void addMember(final UUID uniqueId) {
    this.members.add(uniqueId);
  }

  @Override
  public UUID getLeader() {
    return this.leader;
  }

  public void setLeader(final UUID uniqueId) {
    //this.coleaders.add(this.leader);
    this.leader = uniqueId;
  }

  @Override
  public ObjectOpenHashSet<UUID> getAllPlayers() {
    final ObjectOpenHashSet<UUID> out = new ObjectOpenHashSet<>();

    return out;
  }

  @Override
  public ObjectOpenHashSet<Faction> getAlliances() {
    return this.alliances;
  }

  public void addAlliance(final Faction faction) {
    this.alliances.add(faction);
  }

  @Override
  public ObjectOpenHashSet<Faction> getEnemies() {
    return this.enemies;
  }

  public void addEnemy(final Faction faction) {
    this.enemies.add(faction);
  }

  @Override
  public Instant getLastOnline() {
    return this.lastOnline;
  }

  public void updateLastOnline() {
    this.lastOnline = Instant.now();
  }

  @Override
  public Location getClaimAt(final int x, final int z) {
    return null;
  }

  @Override
  public ObjectOpenHashSet<int[]> getClaims() {
    return null;
  }

  @Override
  public Object2ObjectOpenHashMap<String, Location> getWarps() {
    return warps;
  }

}
