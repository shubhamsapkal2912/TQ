import java.util.Arrays;

public class Department {
    private int did;
    private String dname;
    private Employee employees[];

    Department() {

    }

    Department(int did, String dname, Employee[] employees) {
        this.did = did;
        this.dname = dname;
        this.employees = employees;
    }

    

    public int getDid() {
        return did;
    }

    public void setDid(int did) {
        this.did = did;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public Employee[] getEmployees() {
        return employees;
    }

    public void setEmployees(Employee[] employees) {
        this.employees = employees;
    }

    @Override
    public String toString() {
        return "Department [did=" + did + ", dname=" + dname + ", employees=" + Arrays.toString(employees) + "]";
    }

    

}
