package com.moandjiezana.bootstrapjamon.base.buttons;

public enum ButtonSizes {
  large, small, mini, none {
    @Override
    public String toString() {
      return "";
    }
  };
  
  @Override
  public String toString() {
    return " btn-" + name();
  }
}
