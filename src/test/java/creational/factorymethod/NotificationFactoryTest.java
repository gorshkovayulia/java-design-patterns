package creational.factorymethod;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class NotificationFactoryTest {

    @Test
    public void testCreateNotification() {
        NotificationFactory notificationFactory = new NotificationFactory();
        Notification notification = notificationFactory.createNotification("SMS");
        notification.notifyUser();
    }
}