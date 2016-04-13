package sparkexample;

import static spark.Spark.*;
import spark.ModelAndView;

import spark.template.jade.JadeTemplateEngine;
import java.util.HashMap;
import java.util.Map;

public class Hello {

  public static void main(String[] args) {

    staticFileLocation("/public");

    get("/", (req, res) -> {
      return "hello from after changed";
    });
    Map<String, String> map = new HashMap<>();
    map.put("message", "Hello World!");
    get("/hello", (req, res) -> new ModelAndView(map, "hello"), new JadeTemplateEngine());
    //get("/hello", (req, res) -> {
    //  return "heheehehe";
    //});

  }
}
