package me.ufo.factions.common;

public enum Role {

  MEMBER("+"),
  MODERATOR("*"),
  COLEADER("**"),
  LEADER("***");

  private final String prefix;

  Role(final String prefix) {
    this.prefix = prefix;
  }

  public String getPrefix() {
    return this.prefix;
  }

}
