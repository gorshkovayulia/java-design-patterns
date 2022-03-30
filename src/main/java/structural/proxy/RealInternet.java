package structural.proxy;

public class RealInternet implements Internet {

    @Override
    public String connectTo(String serverhost) throws Exception {
        return new String("Connecting to " + serverhost);
    }
}
