import java.util.Arrays;

public class Organisation {
    static void getSal(Employee []employees,double sal){
        System.out.println("Employee with salary greater than "+sal);
        for(Employee x:employees){
            if(x.getSal()>sal){
                System.out.println(x.getEname());
            }
        }
    }
    public static void main(String[] args) {
        Employee employees[] = new Employee[4];
        employees[0] = new Employee(101, "Shubham", 40000);
        employees[1] = new Employee(102, "Nichit", 45000);
        employees[2] = new Employee(103, "Rupa", 47000);
        employees[3] = new Employee(104, "Snhel", 50000);

        Employee employees1[] = new Employee[2];
        employees1[0] = new Employee(201, "Ankiy", 49000);
        employees1[1] = new Employee(102, "Anmay", 41000);

        Department department[] = new Department[2];
        department[0] = new Department(1, "Finance", employees);
        department[1] = new Department(2, "IT", employees1);
        // System.out.println(Arrays.toString(department));

        for (Department x : department) {
            System.out.println(x.getDname());
            for (Employee e : x.getEmployees()) {
                System.out.println(e.getEid() + " " + e.getEname());
            }
        }
        System.out.println("-------------------------SALARY----------------------");
        getSal(employees, 45000);

    }
}
