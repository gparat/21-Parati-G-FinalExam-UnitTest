
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


}