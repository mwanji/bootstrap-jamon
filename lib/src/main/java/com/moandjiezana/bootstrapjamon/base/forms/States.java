package com.moandjiezana.bootstrapjamon.base.forms;

public enum States {
  error, success, warning, none {
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
