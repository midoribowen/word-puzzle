import org.junit.*;
import static org.junit.Assert.*;

public class AppUnitTest {
  @Test
  public void wordPuzzle_returnsADashForEveryAInUserInput_lDASHsVegDASH() {
    App app = new App();
    assertEquals("L-S VEG-S", app.wordPuzzle("LAS VEGAS"));
  }

  // @Test
  // public void wordPuzzle_returnsADashForEveryEInUserInput_jDASHpDASHnDASHsDASH() {
  //   App app = new App();
  //   assertEquals("J-P-N-S-", app.wordPuzzle("JAPANESE"));
  // }
  //
  // @Test
  // public void wordPuzzle_returnsADashForEveryIInUserInput_mDASHdorDASH() {
  //   App app = new App();
  //   assertEquals("M-DOR-", app.wordPuzzle("MIDORI"));
  // }

}
