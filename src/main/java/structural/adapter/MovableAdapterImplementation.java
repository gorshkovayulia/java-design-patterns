package structural.adapter;

public class MovableAdapterImplementation implements MovableAdapter {
    private Movable luxuryCars;

    @Override
    public double getSpeed() {
        return convertMPHtoKMPH(luxuryCars.getSpeed());
    }

    private double convertMPHtoKMPH(double mph) {
        return mph * 1.60934;
    }
}
