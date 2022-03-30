package structural.proxy;

/**
 * Define an interface to make proxy and service objects interchangeable
 */
public interface Internet {
    void connectTo(String serverhost) throws Exception;
}
