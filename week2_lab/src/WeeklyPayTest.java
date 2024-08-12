import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class WeeklyPayTest {

    @Test
    @DisplayName("WeeklyPay.main prints correct output")
    public void mainIOTest() {
        String expected = "Week: 1 hours: 35 pay: $647.5\n"
        		+ "Week: 2 hours: 40 pay: $740.0\n"
        		+ "Week: 3 hours: 38 pay: $703.0";
        String actual = TestUtility.getOutput("WeeklyPay", null);
        assertEquals(expected, actual);
    }

}

