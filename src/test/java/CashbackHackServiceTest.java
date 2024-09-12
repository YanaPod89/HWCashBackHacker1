import org.testng.annotations.Test;
import ru.netology.service.CashbackHackService;

import static org.testng.Assert.assertEquals;

public class CashbackHackServiceTest {

@Test
   void shouldCalculateCashback() {
    CashbackHackService service = new CashbackHackService();
    int amount = 900;

    int actual = service.remain(amount);
    int expected = 100;

    assertEquals(actual, expected);
}
}
