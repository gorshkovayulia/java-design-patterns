package creational.singleton;

/**
 * In such case, we create the instance of the class in synchronized method or synchronized block,
* so instance of the class is created when required
 */
public class LazyInstantiation {

    // Object is "volatile" since we want to ensure that multiple threads offer the object variable correctly
    // when it is being initialized to Singleton instance.
    // This method drastically reduces the overhead of calling the synchronized method every time.
    private static volatile LazyInstantiation instance;

    // Prevent to instantiate the Singleton class from outside the class
    private LazyInstantiation() {}

    // Provides the global point of access to the Singleton object and returns the instance to the caller
    public static LazyInstantiation getInstance() {
        if (instance == null) {
            synchronized (LazyInstantiation.class) { // Only one thread can execute this at a time
                if (instance == null) { // Check again as multiple threads can reach above step
                    instance = new LazyInstantiation();
                }
            }
        }
        return instance;
    }
}