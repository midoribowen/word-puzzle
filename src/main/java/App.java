import java.util.Map;
import java.util.HashMap;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;

public class App {
  public static void main(String[] args) {
    //Spark and Velocity go in here!
  }

  public static String wordPuzzle (String userInput) {

    userInput = userInput.replace("A", "-");
    userInput = userInput.replace("E", "-");
    userInput = userInput.replace("I", "-");
    // userInput = userInput.replace("O", "-");

    // char[] userInputArray = userInput.toCharArray();
    // char[] vowelsArray = { 'A' };
    // char[] dashArray = { '-' };

    // userInputArray = userInputArray.replace(vowelsArray, dashArray);

    // output = String.valueOf(userInputArray);
    // String output = userInput;
    return userInput;
  }
}
