package structural.decorator;

import org.testng.annotations.Test;
import structural.decorator.Car;
import structural.decorator.SimpleCar;
import structural.decorator.SportCar;
import structural.decorator.Truck;

import static org.testng.Assert.assertEquals;

public class SimpleCarTest {

    @Test
    public void possibleToConvertSimpleCarIntoSportCar() {
        Car simpleCar = new SimpleCar();
        Car sportCar = new SportCar(simpleCar);
        assertEquals(sportCar.getSpeed(), 100);
    }

    @Test
    public void possibleToConvertSimpleCarIntoTruckCar() {
        Car simpleCar = new SimpleCar();
        Car truck = new Truck(simpleCar);
        assertEquals(truck.getBaggageWeight(), 1100);
    }
}
