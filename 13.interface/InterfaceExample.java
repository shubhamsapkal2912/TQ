interface Payment {
    float disc = 0.0f;

    void pay(float amt);
}

class Student implements Payment {
    int id;
    String name;
    double qfees;
    double discFees;

    Student() {

    }

    public Student(int id, String name, double qfees) {
        this.id = id;
        this.name = name;
        this.qfees = qfees;
        discFees = qfees - (disc * qfees);
    }

    public void pay(float amt) {
        System.out.println("Id: " + id + " Name: " + name);
        System.out.println("Your Total Fees " + qfees);
        System.out.println("Discounted fees: " + discFees);
        System.out.println("Paid fees " + amt);
        if ((discFees - amt) != 0) {
            System.out.println("Remaining fees to be paid " + (discFees - amt));
        }
    }
}

class OnlinePayment implements Payment {
    static String mode = "Debit Card";
    String cardNo;
    int cvv;
    double balance;

    OnlinePayment() {
        super();
    }

    OnlinePayment(String cardNo, int cvv, double balance) {
        super();
        this.cardNo = cardNo;
        this.cvv = cvv;
        this.balance = balance;
    }

    public void pay(float amt) {
        System.out.println("Card no :" + cardNo);
        System.out.println("Amount to be paid:" + amt);
        amt = amt - disc * amt;
        System.out.println("Discounted amount:" + amt);
        if (balance > amt) {
            balance -= amt;
            System.out.println("Amount paid, Balance left" + balance);
        } else {
            System.out.println("Insufficient balance:" + balance);
        }

    }

}

public class InterfaceExample {

    public static void main(String[] args) {
        Payment p;
		p= new Student(101, "Shubham", 60000);
		p.pay(19000);
		p.pay(19000);

		System.out.println("------------------");
		
		p= new OnlinePayment("8900 6755 900 455", 900, 45000);
		p.pay(50000);
		p.pay(47000);
    }
}