package com.moandjiezana.bootstrapjamon.base.forms;

public enum States {
  error, success, warning, NONE {
    @Override
    public String toString() {
      return "";
    }
  };

  @Override
  public String toString() {
    return " " + name();
  }
}
