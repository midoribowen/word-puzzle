import org.fluentlenium.adapter.FluentTest;
import org.junit.ClassRule;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import static org.assertj.core.api.Assertions.assertThat;

public class AppIntegrationTest extends FluentTest {
  public WebDriver webDriver = new HtmlUnitDriver();
  public WebDriver getDefaultDriver() {
    return webDriver;
  }

  @ClassRule
  public static ServerRule server = new ServerRule();

  @Test
  public void rootTest() {
    goTo("http://localhost:4567/");
    assertThat(pageSource()).contains("Word Puzzle");
  }

  @Test public void inputTest() {
    goTo("http://localhost:4567/");
    fill("#userInput").with("SuPeRcAlI FrAgIlIsYiCeXpIaLi DoCiOuS");
    submit(".btn");
    assertThat(pageSource()).contains("S-P-Rc-l- Fr-g-l-sY-C-Xp--L- D-C---S");
  }


}
