package constructor.assignment;

public class Employee {
    private String name;
    private int id;
    private double sal;

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public double getSal() {
        return sal;
    }
    Employee() {

    }

    Employee(String name, int id, double sal) {
        this.name = name;
        this.sal = sal;
        this.id = id;
    }

    public static void main(String[] args) {

    }
}
