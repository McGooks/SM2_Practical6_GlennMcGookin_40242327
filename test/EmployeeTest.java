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


}