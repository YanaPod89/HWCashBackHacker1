
import org.junit.Test;
import ru.netology.service.CashbackHackService;

import static org.junit.Assert.assertEquals;


public class CashbackHackServiceTest {

@Test
   public void shouldCalculateCashback() {
    CashbackHackService service = new CashbackHackService();
    int amount = 900;

    int actual = service.remain(amount);
    int expected = 100;

    assertEquals(actual, expected);
}

 @Test
 public void shouldNotCalculateCashback() {
  CashbackHackService service = new CashbackHackService();
  int amount = 1000;

  int actual = service.remain(amount);
  int expected = 0;

  assertEquals(expected, actual);
 }
}
