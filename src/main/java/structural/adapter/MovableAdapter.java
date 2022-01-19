package structural.adapter;

// MovableAdapter interface is based on the same Movable class.
// It may be slightly modified to yield different results in different scenarios.
public interface MovableAdapter {
    // returns speed in KM/H
    double getSpeed();
}
