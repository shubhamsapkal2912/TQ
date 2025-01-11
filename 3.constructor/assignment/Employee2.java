package constructor.assignment;

public class Employee2 {
    int eid;
    String ename;
    double basic_sal;
    double pf;
    double hra;
    double da;
    double net_sal;
    int dept_no;

    Employee2(){
        
    }
    Employee2(int eid,String ename, double basic_sal,/*double pf,double hra,double da,double net_sal,*/int dept_no){
        this.eid=eid;
        this.ename=ename;
        this.basic_sal=basic_sal;
        // this.pf=pf;
        // this.hra=hra;
        // this.da=da;
       // this.net_sal=net_sal;
        this.pf=basic_sal*0.10;
        this.hra=basic_sal*0.15;
        this.da=basic_sal*0.20;
        this.dept_no=dept_no;
    }
    void displayEmp(){
        System.out.println("Emp Name: "+ename);
        System.out.println("Dept No: "+dept_no);
    }
    void calculateSal(){
        net_sal=basic_sal-pf+da+hra;
        System.out.println("Net Salary is : "+net_sal);
    }

    public static void main(String[] args) {
        Employee2 emp1=new Employee2(1, "Shubham", 50000,101 );
        emp1.displayEmp();
        emp1.calculateSal();
    }
}
