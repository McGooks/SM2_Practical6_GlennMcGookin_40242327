import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class EmployeeTest {

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void testName() {
        String expected = "Glenn";
        Employee employee = new Employee();
        employee.setName(expected);
        String actual = employee.getName();
        assertEquals(expected, actual);
    }

    @Test
    public void testAge() {
        int expected = 18;
        Employee employee = new Employee();
        employee.setAge(expected);
        int actual = employee.getAge();
        assertEquals(expected, actual);
    }

    @Test
    public void testNameAge() {
        int expectedAge = 18;
        Employee employee = new Employee();
        employee.setAge(expectedAge);
        int actual = employee.getAge();
       // assertEquals(expected, actual);
    }


}