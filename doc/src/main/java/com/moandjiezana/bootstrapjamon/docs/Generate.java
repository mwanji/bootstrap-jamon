package com.moandjiezana.bootstrapjamon.docs;

import java.io.File;
import java.io.FileWriter;

public class Generate {

  public static void main(String[] args) throws Exception {
    File parent = new File("target/site/bootstrap-jamon/");
    parent.mkdirs();
    new index().render(new FileWriter(new File(parent, "index.html")));
  }
}
