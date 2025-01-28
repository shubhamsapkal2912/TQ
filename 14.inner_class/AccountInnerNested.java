class Bank {
    private static String bname = "BOI";
    static String bankLoc;
    static String ifscCode;
    int accNo;
    String aname;
    double balance;

    static {
        bankLoc = "Pune";
        ifscCode = "BOI992233";
    }

    Bank() {

    }

    Bank(String aname, int accNo, double balance) {
        this.aname = aname;
        this.accNo = accNo;
        this.balance = balance;
    }

    void displayDetails() {
        System.out.println(bname + " " + bankLoc);
        System.out.println("IFSC Code " + ifscCode);
    }

    void display() {
        System.out.println("This locker belongs to :" + aname + " with account no: " + accNo);
        System.out.println("Balance : " + balance);
    }

    class Locker{
        int lockerId;
        String pass;
     static double rent=2000;
        Locker(){

        }
        Locker(int lockerId, String pass) {
            super();
            this.lockerId = lockerId;
            this.pass = pass;
        }

        void displayLockerDetails(){
            displayDetails();
            display();
            System.out.println("Locker ID: "+lockerId);
            System.out.println("Rent: "+rent);
        }

        
    }

}

public class AccountInnerNested {
    public static void main(String[] args) {

        //1st way
        System.out.println("---------------------------------");
        Bank acc1 =new Bank("shubham", 3060, 90000);
        acc1.displayDetails();
        acc1.display();

        Bank.Locker l1=acc1.new Locker(101, "pass123");
        System.out.println("---------------------------------");
        l1.displayLockerDetails();
        
        //2nd way
        System.out.println("---------------------------------");
        Bank.Locker l2=new Bank("abhi", 8980, 90890).new Locker(105, "s123");
        l2.displayLockerDetails();

    }
}
