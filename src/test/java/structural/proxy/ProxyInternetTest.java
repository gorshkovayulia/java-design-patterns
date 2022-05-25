package structural.proxy;

import org.testng.annotations.Test;
import structural.proxy.Internet;
import structural.proxy.ProxyInternet;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertThrows;

public class ProxyInternetTest {

    @Test
    public void possibleToConnectToAllowedServers() throws Exception {
        Internet internet = new ProxyInternet();
        assertEquals(internet.connectTo("geek.org"), "Connecting to geek.org");
    }

    @Test
    public void impossibleToConnectToNotAllowedServers() throws Exception {
        Internet internet = new ProxyInternet();
        assertThrows(Exception.class, () -> internet.connectTo("test.com"));
    }
}