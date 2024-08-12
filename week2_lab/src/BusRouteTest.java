import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BusRouteTest {

    @Test
    @DisplayName("BusRoute.main prints correct output")
    public void mainIOTest() {
        String expected = "Bus begins its route\n"
        		+ "7 people get on at stop#1\n"
        		+ "Departing stop#1 with 7 passengers\n"
        		+ "5 people get off at stop#2\n"
        		+ "2 people get on at stop#2\n"
        		+ "Departing stop#2 with 4 passengers\n"
        		+ "3 people get off at stop#3\n"
        		+ "8 people get on at stop#3\n"
        		+ "Departing stop#3 with 9 passengers";
        String actual = TestUtility.getOutput("BusRoute", null);
        assertEquals(expected, actual);
    }

}

