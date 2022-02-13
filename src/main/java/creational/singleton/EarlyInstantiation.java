package creational.singleton;

/**
 * In such case, we create the instance of the class at the time of declaring the static data member,
 * so instance of the class is created at the time of classloading
 */
public class EarlyInstantiation {

    // Gets memory only once because of static
    private static EarlyInstantiation instance = new EarlyInstantiation();

    // Prevent to instantiate the Singleton class from outside the class
    private EarlyInstantiation() {}

    // Provides the global point of access to the Singleton object and returns the instance to the caller
    public static EarlyInstantiation getInstance() {
        return instance;
    }
}
