import Vehicles.SUV;
import Vehicles.SportCar;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class CarsTest {

    private SUV suv;
    private SportCar sportCar;

    @Before
    public void before() {
        suv = new SUV("Ford", "Raptor", 150, 45000);
        sportCar = new SportCar("MacLaren", "P1", 245, 300000);
    }

    @Test
    public void canGetName() {
        assertEquals("Ford", suv.getName());
        assertEquals("MacLaren", sportCar.getName());
    }

}
