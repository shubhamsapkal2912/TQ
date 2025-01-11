import java.util.*;

class PayBill {

    void calcBill(double bill) {
        System.out.println("Bill paid by cash No Discount");
        System.out.println("Total Bill is: " + bill);
    }

    void calcBill(double bill, String mode) {
        double discount = (bill * 0.15);
        System.out.println("Total Amt : " + bill);
        System.out.println("Amount Paid by " + mode + " Mode");
        System.out.println("Discount is : " + discount);
        System.out.println("Final price is " + (bill - discount));
    }
}

public class Payment {
    public static void main(String[] args) {
        Scanner sobj = new Scanner(System.in);
        PayBill p1 = new PayBill();
        System.out.println("Enter Amount");
        double amt = sobj.nextDouble();
        System.out.println("Enter Payment Mode");
        String mode = sobj.next();
        if (mode.equalsIgnoreCase("cash")) {
            p1.calcBill(amt);
        } else {
            p1.calcBill(amt, mode);
        }
        sobj.close();

    }
}
