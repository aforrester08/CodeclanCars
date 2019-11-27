import Locations.CarLot;
import People.Customer;
import People.Salesman;
import Vehicles.SUV;
import Vehicles.SportCar;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CarLotTest {

    private CarLot carLot;
    private Customer customer;
    private Salesman salesman;
    private SportCar car;
    private SUV suv;

    @Before
    public void before() {
        salesman = new Salesman("Alex", 200);
        carLot = new CarLot("Daves Lot", salesman);
        customer = new Customer("Keith", 1000000);
        car = new SportCar("MacLaren", "P1", 250, 250000);
        suv = new SUV("Ford", "F150", 150, 70000);
        carLot.addCarToLot(car);
        carLot.customerArrives(customer);
        carLot.sellCar(car, customer);
    }

    @Test
    public void removesCarFromLot() {
        assertEquals(0, carLot.getCars().size());
    }
    @Test
    public void vaultIncreases() {
        assertEquals(250500, carLot.getVault());
    }
    @Test
    public void customersWalletDecreases() {
        assertEquals(750000, customer.getWallet());
    }

    @Test
    public void garageCountShouldIncrease(){
        assertEquals(1, customer.getGarage().size());
    }
}
