package me.ufo.factions;

import org.bukkit.plugin.java.JavaPlugin;

public final class Factions extends JavaPlugin implements me.ufo.factions.api.Factions {

  /* MANAGERS */
  private FactionManager factionManager;
  private FactionPlayerManager playerManager;

  @Override
  public void onEnable() {

  }

  @Override
  public void onDisable() {

  }

  @Override
  public FactionManager getFactionManager() {
    return this.factionManager;
  }

  @Override
  public FactionPlayerManager getPlayerManager() {
    return this.playerManager;
  }

}
