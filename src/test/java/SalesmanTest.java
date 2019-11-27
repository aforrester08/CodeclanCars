import People.Salesman;
import Vehicles.SUV;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class SalesmanTest {

    private Salesman salesman;
    private SUV suv;

    @Before
    public void before() {
        salesman = new Salesman("Alex", 1000000);
    }
    @Test
    public void canGetName() {
        assertEquals("Alex", salesman.getName());
    }
    @Test
    public void canGetWallet() {
        assertEquals(1000000, salesman.getWallet());
    }
}
