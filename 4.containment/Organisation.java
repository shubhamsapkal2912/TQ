public class Organisation {
    
    public static void main(String[] args) {
        Department d1=new Department(101,"Accounts");
        Department d2=new Department(102,"Sales");

        Employee e1=new Employee(1, "Shubham", 99999, d1);
        Employee e2=new Employee(2, "Ronit", 99999, d2);

        System.out.println(e1);
        //System.out.println(e2);

        //anonymous object
        Employee e3=new Employee(3, "Abhi", 99999, new Department(103, "Army"));
        //System.out.println(e3);

        //System.out.println(e2.compareDept(e1));
        //System.out.println(e2.compareSalary(e1));

        e1.calTax();
        
        System.out.println(e1.getSal());

        System.out.println("Total Sal "+Employee.getTotalSalDisbursed());
        System.out.println("Total Emp "+Employee.getTotalEmp());
        
    }
}
