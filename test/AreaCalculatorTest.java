import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AreaCalculatorTest {

    int num1, num2;
    AreaCalculator areaCalculator;

    @Before
    public void setUp() throws Exception {

        num1 = 2;
        num2 = 4;

        areaCalculator = new AreaCalculator();
    }

    @Test
    public void square() {
        int expected = num1 * num2;
        int actual = areaCalculator.square(num1,num2);
        assertEquals(expected,actual);
    }
}