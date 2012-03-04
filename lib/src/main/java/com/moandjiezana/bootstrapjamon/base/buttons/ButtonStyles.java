package com.moandjiezana.bootstrapjamon.base.buttons;

import com.moandjiezana.bootstrapjamon.base.IconColors;

public enum ButtonStyles {
  primary, info, success, warning, danger, inverse, none {
    @Override
    public String toString() {
      return "";
    }
  };
  
  public boolean usesWhiteIcon(IconColors iconColor) {
    if (iconColor == IconColors.AUTO) {
      return this != none;
    }
    
    return iconColor == IconColors.WHITE;
  }
  
  @Override
  public String toString() {
    return " btn-" + name();
  }
}
