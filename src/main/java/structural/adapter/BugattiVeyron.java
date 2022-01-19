package structural.adapter;

// Create one concrete implementation of Movable interface
public class BugattiVeyron implements Movable {

    @Override
    public double getSpeed() {
        return 268;
    }
}
