package structural.proxy;

public class RealInternet implements Internet {

    @Override
    public String connectTo(String serverhost) {
        return "Connecting to " + serverhost;
    }
}
