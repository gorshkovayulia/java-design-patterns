package structural.decorator;

/**
 * This is a class-decorator that makes a sport car from simple car
 */
public class SportCar implements Car {
    private Car car;

    public SportCar(Car car){
        this.car = car;
    }

    @Override
    public int getSpeed() {
        return this.car.getSpeed() + 50; // increase the speed of simple car
    }

    @Override
    public int getBaggageWeight() {
        return this.car.getBaggageWeight();
    }
}
