public class Employee {
    private int id;
    private String name;
    private double sal;
    private Department dept;
    private Double tax;
    static  double totalSaldisbursed;
    static  int totalEmp=0;;

    {
        totalEmp++;
    }
    public Employee() {

    }

    public Employee(int id, String name, double sal, Department dept) {
        this.id = id;
        this.name = name;
        this.sal = sal;
        this.dept = dept;
        setTotalSaldisbursed();
        //setTotalEmp();
    }
    

    public  void setTotalSaldisbursed() {
        totalSaldisbursed += sal;
    }
    public static double getTotalSalDisbursed(){
        return totalSaldisbursed;
    }
    // public void setTotalEmp(){
    //     totalEmp++;
    // }
    public static int getTotalEmp(){
        return totalEmp;
    }


    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    public void setDept(Department dept) {
        this.dept = dept;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSal() {
        return sal;
    }

    public Department getDept() {
        return dept;
    }

    public boolean compareSalary(Employee e) {
        if (this.sal == (e.sal)) {
            return true;
        } else {
            return false;
        }
    }

    public boolean compareDept(Employee e) {
        if (this.dept.equals(e.dept)) {
            return true;
        } else {
            return false;
        }
    }

    

    public void calTax() {
        if (sal < 30000) {
            System.out.println("No TAX");
        } else if (sal > 30000 && sal < 50000) {
            tax = sal * 0.5;
            System.out.println("Tax is: " + tax);
        } else if (sal > 50000) {
            tax = sal * 0.10;
            System.out.println("Tax is: " + tax);
        }
    }

    
    public String toString() {
        return "Name: " + name + " Salary: " + sal + " ID: " + id + " " + dept;
    }

}
