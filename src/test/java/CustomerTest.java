import People.Customer;
import People.Salesman;
import Vehicles.SportCar;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class CustomerTest {

    private Customer customer;
    private SportCar car;

    @Before
    public void before() {
        customer = new Customer("Alex", 1000000);
    }
    @Test
    public void canGetName() {
        assertEquals("Alex", customer.getName());
    }
    @Test
    public void canGetWallet() {
        assertEquals(1000000, customer.getWallet());
    }

}
