import java.util.Map;
import java.util.HashMap;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App {
  public static void main(String[] args) {
    //Spark and Velocity go in here!
  }

  public static String wordPuzzle (String userInput) {

    userInput = userInput.replace("A", "-");
    userInput = userInput.replace("a", "-");
    userInput = userInput.replace("E", "-");
    userInput = userInput.replace("e", "-");
    userInput = userInput.replace("I", "-");
    userInput = userInput.replace("i", "-");
    userInput = userInput.replace("O", "-");
    userInput = userInput.replace("o", "-");
    userInput = userInput.replace("U", "-");
    userInput = userInput.replace("u", "-");

    return userInput;
  }
}
