package structural.decorator;

/**
 * This is a class-decorator that makes a truck car from simple car
 */
public class Truck implements Car {
    private Car car;

    public Truck(Car car){
        this.car = car;
    }

    @Override
    public int getSpeed() {
        return this.car.getSpeed();
    }

    @Override
    public int getBaggageWeight() {
        return this.car.getBaggageWeight() + 1000; // increase the load capacity of simple car
    }
}
