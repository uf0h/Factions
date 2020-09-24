package me.ufo.factions.common;

import java.util.UUID;

public interface FactionManager {

  boolean createFaction(final UUID uniqueId, final String tag);

}
