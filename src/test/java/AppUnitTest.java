import org.junit.*;
import static org.junit.Assert.*;

public class AppUnitTest {
  @Test
  public void wordPuzzle_returnsADashForEveryAInUserInput_scrDASHbble() {
    App app = new App();
    assertEquals("SCR-BBLE", app.wordPuzzle("SCRABBLE"));
  }
}
