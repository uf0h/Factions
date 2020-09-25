package me.ufo.factions.api;

import java.util.UUID;
import me.ufo.factions.common.Role;
import org.bukkit.entity.Player;

public interface FactionPlayer<T extends Faction<T>> {

  UUID getUniqueId();

  Player getAsBukkitPlayer();

  boolean isOnline();

  T getFaction();

  String getFactionTag();

  Role getRole();

}
