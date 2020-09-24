package me.ufo.factions;

import java.util.List;
import com.google.common.base.Preconditions;
import me.ufo.factions.api.Faction;

public final class Board implements me.ufo.factions.api.Board {

  private boolean loaded;

  @Override
  public int load() {
    Preconditions.checkArgument(!loaded, "The faction board is already loaded.");

    loaded = true;
    return 0;
  }

  @Override
  public boolean saveFaction(final Faction faction) {
    return false;
  }

  @Override
  public boolean deleteFaction(final Faction faction) {
    return false;
  }

  @Override
  public Faction getFaction(final String tag) {
    return null;
  }

  @Override
  public Faction getFaction(final int x, final int z) {
    return null;
  }

  @Override
  public List<Faction> getFactions() {
    return null;
  }

}
