package me.ufo.factions;

import java.util.UUID;
import me.ufo.factions.common.Role;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

public final class FactionPlayer implements me.ufo.factions.api.FactionPlayer<Faction> {

  private final UUID uniqueId;

  private Faction faction;
  private Role role;

  public FactionPlayer(final UUID uniqueId) {
    this.uniqueId = uniqueId;
  }

  @Override
  public UUID getUniqueId() {
    return this.uniqueId;
  }

  @Override
  public Player getAsBukkitPlayer() {
    return Bukkit.getPlayer(uniqueId);
  }

  @Override
  public boolean isOnline() {
    return Bukkit.getPlayer(uniqueId) != null;
  }

  @Override
  public Faction getFaction() {
    return this.faction;
  }

  public void setFaction(final Faction faction) {
    this.faction = faction;
  }

  @Override
  public String getFactionTag() {
    return this.faction.getTag();
  }

  @Override
  public Role getRole() {
    return this.role;
  }

  public void setRole(final Role role) {
    this.role = role;
  }

}
