import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SeafoodMarketTest {

    @Test
    @DisplayName("WeeklyPay.main prints correct output for input: 5 8.99")
    public void mainIOTest1() {
    	String input = "5 8.99";
        String expected = "Enter pounds of fish and price per pound: "
        		+ "5 lbs at $8.99 per lb = $44.95";
        String actual = TestUtility.getOutput("SeafoodMarket", input);
        assertEquals(expected, actual);
    }
    
    @Test
    @DisplayName("WeeklyPay.main prints correct output for input: 7 12.25")
    public void mainIOTest2() {
    	String input = "7 12.25";
        String expected = "Enter pounds of fish and price per pound: "
        		+ "7 lbs at $12.25 per lb = $85.75";
        String actual = TestUtility.getOutput("SeafoodMarket", input);
        assertEquals(expected, actual);
    }

}

