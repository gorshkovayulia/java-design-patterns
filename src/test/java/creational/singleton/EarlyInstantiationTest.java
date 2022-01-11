package creational.singleton;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class EarlyInstantiationTest {

    @Test
    public void getInstanceMethodReturnsTheSameObject() {
        EarlyInstantiation instance = EarlyInstantiation.getInstance();
        EarlyInstantiation instance2 = EarlyInstantiation.getInstance();
        assertTrue(instance == instance2);
    }
}