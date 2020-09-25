package me.ufo.factions;

import org.bukkit.plugin.java.JavaPlugin;

public final class Factions extends JavaPlugin implements me.ufo.factions.api.Factions {

  /* INSTANCE */
  private static Factions instance;

  /* BOARD */
  private Board board;

  /* MANAGERS */
  private FactionManager factionManager;
  private FactionPlayerManager playerManager;

  public Factions() {
    instance = this;
  }

  @Override
  public void onEnable() {
    this.board = new Board();

    this.factionManager = new FactionManager();
    this.playerManager = new FactionPlayerManager();
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
