import org.junit.*;
import static org.junit.Assert.*;

public class AppUnitTest {
  @Test
  public void wordPuzzle_returnsADashForEveryAInUserInput_l_sG_t_s() {
    App app = new App();
    assertEquals("L-S G-T-S", app.wordPuzzle("LAS GATAS"));
  }
  
  @Test
  public void wordPuzzle_returnsADashForEveryEInUserInput__mpty_gg() {
    App app = new App();
    assertEquals("-MPTY -GG", app.wordPuzzle("EMPTY EGG"));
  }

  @Test
  public void wordPuzzle_returnsADashForEveryIInUserInput_g_t_n_t() {
    App app = new App();
    assertEquals("G-T -N-T", app.wordPuzzle("GIT INIT"));
  }

  @Test
  public void wordPuzzle_returnsADashForEveryOInUserInput__ch_() {
    App app = new App();
    assertEquals("-CH-", app.wordPuzzle("OCHO"));
  }

  @Test
  public void wordPuzzle_returnsADashForEveryUInUserInput_S_l_() {
    App app = new App();
    assertEquals("S-L-", app.wordPuzzle("SULU"));
  }

  @Test
  public void wordPuzzle_returnsFullSentenceWithCaseSensitivity_b_l__v_Y__C_n_ndY__r_H_lfw_yTh_r_Th__d_r_R__s_v_lt() {
    App app = new App();
    assertEquals("B-l--v- y-- c-n -nd y--'r- h-lfw-y th-r-. Th--d-r- R--s-v-lt", app.wordPuzzle("Believe you can and you're halfway there. Theodore Roosevelt"));
  }

}
