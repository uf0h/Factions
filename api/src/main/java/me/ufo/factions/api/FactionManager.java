package me.ufo.factions.api;

import java.util.UUID;
import me.ufo.factions.common.Manager;

public interface FactionManager<T extends Faction<T>> extends Manager {

  boolean createFaction(final UUID uniqueId, final String tag);

  boolean deleteFaction(final T faction);

}
