class Employee {

    int id;
    String name;

    Employee() {

    }

    Employee(int id, String name) {
        this.name = name;
        this.id = id;
    }

    public Employee getInstance() {
        System.out.println("In Employee ");
        return new Employee(1,"Shubham");
    }

    public String toString() {
        return "Employee[ID:" + id + "Name:" + name;
    }
}

class Manager extends Employee {
    double salary;

    Manager() {

    }

    Manager(int id, String name, double salary) {
        super(id, name);
        this.salary = salary;
    }

    public Manager getInstance() {
        System.out.println("In manager");
        return new Manager(id, name, salary);
    }
    // public Employee getInstance() {
    //     System.out.println("In Employee ");
    //     return new Employee(1,"Shubham");
    // }

    public String toString() {
        return super.toString() + "Salary:" + salary;
    }
}

public class Organisation {
    public static void main(String[] args) {
        Manager m1 = new Manager(1, "Shubham", 90000);
        System.out.println(m1);
        m1.getInstance();

        Employee e1 = new Employee();
        System.out.println(e1);
    }
}
