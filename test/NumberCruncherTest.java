import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class NumberCruncherTest {

    int num1,num2,num3;
    NumberCruncher numberCruncher;

    @Before
    public void setUp() throws Exception {

        num1 = 2;
        num2 = 4;
        num3 = 6;

        numberCruncher = new NumberCruncher();
    }

    @Test
    public void testAddNumbers1() {
        int expected = num1 + num2;
        int actual = numberCruncher.addNumbers(num1,num2);
        assertEquals(expected,actual);
    }

    @Test
    public void testAddNumbers2() {
        int expected = num1 + num2 + num3;
        int actual = numberCruncher.addNumbers(num1,num2,num3);
        assertEquals(expected,actual);
    }

    @Test
    public void testMultiply1() {
        int expected = num1 * num2;
        int actual = numberCruncher.multiply(num1,num2);
        assertEquals(expected,actual);
    }

    @Test
    public void testMultiply2() {
        int expected = (num1 * num2) * num3;
        int actual = numberCruncher.multiply(num1,num2,num3);

    }

    @Test
    public void testDivNumbers1() {
        double expected = 3.33;
        assertEquals(expected,numberCruncher.divNumbers(10.0,3.0),0.1);
    }

    @Test
    public void testDivNumbers2() {
        int num4 = 6;
        int num5 = 3;
        int expected = num4 / num5;
        int actual;
        try{
            actual = numberCruncher.divideNumbers(num4, num5);
            assertEquals(expected, actual);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test (expected = Exception.class)
    public void testDivNumbers3() throws Exception {
        int num4 = 2;
        int num5 = 0;
        NumberCruncher numberCruncher = new NumberCruncher();
        numberCruncher.divideNumbers(num4,num5);
    }

}