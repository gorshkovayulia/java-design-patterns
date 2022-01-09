package creational.prototype;

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
        return new EmployeeRecord(id,name,salary,address);
    }
}

