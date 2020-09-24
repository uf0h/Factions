package me.ufo.factions.api;

import me.ufo.factions.common.FactionManager;
import me.ufo.factions.common.FactionPlayerManager;

public interface Factions {

  FactionManager getFactionManager();

  FactionPlayerManager getPlayerManager();

}
