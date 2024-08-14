import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BusRouteTest {

    @Test
    @DisplayName("BusRoute.main prints correct output")
    public void mainIOTest() {
        String expected = "Bus begins its route\n"
        		+ "8 passengers get on at stop#1\n"
        		+ "Departing stop#1 with 8 passengers\n"
        		+ "2 passengers get off at stop#2\n"
        		+ "Departing stop#2 with 6 passengers\n"
        		+ "Half the passengers get off at stop#3\n"
        		+ "Departing stop#3 with 3 passengers\n"
        		+ "The number of passengers triples at stop#4\n"
        		+ "Departing stop#4 with 9 passengers";
        String actual = TestUtility.getOutput("BusRoute", null);
        assertEquals(expected, actual);
    }

}

