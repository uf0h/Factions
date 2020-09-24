package me.ufo.factions.api;

import java.util.List;

public interface Board {

  int load();

  boolean saveFaction(final Faction faction);

  boolean deleteFaction(final Faction faction);

  Faction getFaction(final String tag);

  Faction getFaction(final int x, final int z);

  List<Faction> getFactions();

}
