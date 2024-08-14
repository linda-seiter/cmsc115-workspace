import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class StudentInfoTest {

    @Test
    @DisplayName("StudentInfo.main prints correct output")
    public void mainIOTest() {
    	String expected = "Age: 28 gpa: 3.8\n"
    			+ "Age: 29 gpa: 4.0";
        String actual = TestUtility.getOutput("StudentInfo", null);
        assertEquals(expected, actual);
    }
    

}

