package me.ufo.factions.api;

import java.util.UUID;
import org.bukkit.entity.Player;

public interface FactionPlayer {

  UUID getUniqueId();

  Player getAsBukkitPlayer();

  boolean isOnline();

  Faction getFaction();

  String getFactionName();

}
