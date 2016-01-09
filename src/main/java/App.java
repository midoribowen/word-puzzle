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

    get("/output", (request, response) -> {
      HashMap model = new HashMap();
      model.put("template", "templates/output.vtl");

      String userInput = request.queryParams("userInput");
      String output = wordPuzzle(userInput);

      model.put("userInput", userInput);
      model.put("output", output);
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

  }

  public static String wordPuzzle (String userInput) {

    String output = userInput.replace("A", "-");
    output = output.replace("a", "-");
    output = output.replace("E", "-");
    output = output.replace("e", "-");
    output = output.replace("I", "-");
    output = output.replace("i", "-");
    output = output.replace("O", "-");
    output = output.replace("o", "-");
    output = output.replace("U", "-");
    output = output.replace("u", "-");

    return output;
  }
}
