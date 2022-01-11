package creational.prototype;

import java.util.Objects;

public class EmployeeRecord implements Prototype {

    private int id;
    private String name;
    private double salary;
    private String address;


    public EmployeeRecord(int id, String name, double salary, String address) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.address = address;
    }

    public void showRecord(){
        System.out.println(id + "\t" + name + "\t" + "\t" + salary + "\t" + address);
    }

    // Will return another EmployeeRecord with the same id, name, salary and address to the one created before
    @Override
    public Prototype getClone() {
        return new EmployeeRecord(id, name, salary, address);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        EmployeeRecord that = (EmployeeRecord) o;
        return id == that.id &&
                Double.compare(that.salary, salary) == 0 &&
                name.equals(that.name) && address.equals(that.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, salary, address);
    }
}

