package me.ufo.factions;

import java.util.UUID;
import com.google.common.base.Preconditions;

public final class FactionManager implements me.ufo.factions.api.FactionManager<Faction> {

  private boolean loaded;

  @Override
  public boolean load() {
    Preconditions.checkArgument(!loaded, "The faction manager is already loaded.");

    loaded = true;
    return false;
  }

  @Override
  public boolean createFaction(final UUID uniqueId, final String tag) {
    return false;
  }

  @Override
  public boolean deleteFaction(final Faction faction) {
    return false;
  }

}
