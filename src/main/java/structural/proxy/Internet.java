package structural.proxy;

/**
 * Define an interface to make proxy and service objects interchangeable
 */
public interface Internet {
    String connectTo(String serverhost) throws Exception;
}
