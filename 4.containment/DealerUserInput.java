import java.util.Scanner;

public class DealerUserInput {

    static Scanner sobj=new Scanner(System.in);
    public void enterCarDetails(Car c){
        System.out.println("Enter Car Name");
        c.setName(sobj.nextLine());
        System.out.println("Enter Car Model");
        c.setModel(sobj.nextLine());
        System.out.println("Enter Price");
        c.setPrice(sobj.nextDouble());

        c.setCompany(new Company());
        System.out.println("Enter Country");
        sobj.next();
        c.getCompany().setCountry(sobj.nextLine());
        System.out.println("Enter Company Name");
        c.getCompany().setName(sobj.nextLine());
        

    }
    public static void main(String[] args) {
        DealerUserInput d1=new DealerUserInput();
        Car c1=new Car();
        Car c2=new Car();
        d1.enterCarDetails(c1);
        d1.enterCarDetails(c2);

        System.out.println(c1);
        System.out.println(c2);

    }
}
