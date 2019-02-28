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
    public void addNumbers() {
        System.out.println("About to test addNumbers");
        int expected = num1 + num2;
        int actual = numberCruncher.addNumbers(num1,num2);
        assertEquals(expected,actual);
        System.out.println("Test addNumbers Finished");
    }

    @Test
    public void addNumbers1() {
        System.out.println("About to test addNumbers");
        int expected = num1 + num2 + num3;
        int actual = numberCruncher.addNumbers(num1,num2,num3);
        assertEquals(expected,actual);
        System.out.println("Test addNumbers Finished");
    }
}