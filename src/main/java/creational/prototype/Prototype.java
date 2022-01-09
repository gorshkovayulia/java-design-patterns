package creational.prototype;

public interface Prototype {

    // Will be implemented in the class that will implement the prototype to return a new object of the same class
    Prototype getClone();

}
