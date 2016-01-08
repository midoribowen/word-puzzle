import org.junit.*;
import static org.junit.Assert.*;

public class AppUnitTest {
  @Test
  public void wordPuzzle_returnsADashForEveryAInUserInput_lDASHsGDASHtDASHs() {
    App app = new App();
    assertEquals("L-S G-T-S", app.wordPuzzle("LAS GATAS"));
  }

  @Test
  public void wordPuzzle_returnsADashForEveryEInUserInput_DASHmptyDASHgg() {
    App app = new App();
    assertEquals("-MPTY -GG", app.wordPuzzle("EMPTY EGG"));
  }

  // @Test
  // public void wordPuzzle_returnsADashForEveryIInUserInput_gDASHtDASHnDASHt() {
  //   App app = new App();
  //   assertEquals("G-T -N-T", app.wordPuzzle("GIT INIT"));
  // }
  //
  // @Test
  // public void wordPuzzle_returnsADashForEveryOInUserInput_DASHchDASH() {
  //   App app = new App();
  //   assertEquals("-CH-", app.wordPuzzle("OCHO"));
  // }
  //
  // @Test
  // public void wordPuzzle_returnsADashForEveryUInUserInput_SDASHlDASH() {
  //   App app = new App();
  //   assertEquals("")
  // }

}
