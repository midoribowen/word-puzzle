import java.util.Map;
import java.util.HashMap;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;

public class App {
  public static void main(String[] args) {
    staticFileLocation("/public");
    String layout = "templates/layout.vtl";

    get("/", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      model.put("template", "templates/index.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());
    
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
