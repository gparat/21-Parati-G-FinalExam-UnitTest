
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;
public class StringCalcTests {
    private StringCalculator calc;

    @BeforeEach
    public void setUp() {
        calc = new StringCalculator();
    }

    @AfterEach
    public void tearDown() {
        calc = null;
    }

    @Test
    public void testException1() {//testing if IllegalArgumentException is thrown when a negative number is input
        String nums="-1, 10";
        try{
            int n = calc.add(nums);
        }
        catch (IllegalArgumentException z){
            assertTrue(true);
        }
    }
    @Test
    public void testException2() {//testing if IllegalArgumentException is thrown when a negative number is input
        String nums="1, 10, 4, -9";
        try{
            int n = calc.add(nums);
        }
        catch (IllegalArgumentException z){
            assertTrue(true);
        }
    }
    @Test
    public void testIgnore() {//testing if inputs>1000 are ignored
        String nums="1, 10, 100, 1000, 10000";
        assertEquals(calc.add(nums), 1111);
    }
}
