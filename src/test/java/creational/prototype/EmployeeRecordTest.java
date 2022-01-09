package creational.prototype;

import org.testng.Assert;
import org.testng.annotations.Test;

public class EmployeeRecordTest {

    @Test
    public void clonedObjectIsEqualToPrototype() {
        EmployeeRecord employeeRecord = new EmployeeRecord(1, "Thomas", 1200, "Moscow");
        EmployeeRecord clonedEmployee = (EmployeeRecord) employeeRecord.getClone();
        Assert.assertEquals(clonedEmployee, employeeRecord);
    }
}