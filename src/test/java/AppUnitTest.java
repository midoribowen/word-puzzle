import org.junit.*;
import static org.junit.Assert.*;

public class AppUnitTest {
  @Test
  public void wordPuzzle_returnsADashForEveryAInUserInput_scrDASHbble() {
    App app = new App();
    assertEquals("L-S VEG-S", app.wordPuzzle("LAS VEGAS"));
  }
}
