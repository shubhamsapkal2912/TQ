import java.util.*;
public class OrganisationUserInput {
static Scanner sobj=new Scanner(System.in);
public void enterEmployee(Employee e){
    System.out.println("Enter Emp ID: ");
    e.setId(sobj.nextInt());
    System.out.println("Enter Emp Name: ");
    e.setName(sobj.nextLine());
    System.out.println("Enter Emp Salary: ");
    e.setSal(sobj.nextDouble());

    e.setDept(new Department());
    System.out.println("Enter Emp");
    
}
    public static void main(String[] args) {
        
    }
}
