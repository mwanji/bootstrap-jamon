package com.moandjiezana.bootstrapjamon.docs;

import java.io.FileWriter;

public class Generate {

  public static void main(String[] args) throws Exception {
    new index().render(new FileWriter("index.html"));
  }
}
