class LifeStyle {
    private String mallName = "Phoenix Milleium";
    private String mallLocation = "Pune, Wakad";

    private int id;
    private String name;
    private double mobileNo;

    LifeStyle() {

    }

    LifeStyle(int id, String name, double mobileNo) {
        this.id = id;
        this.name = name;
        this.mobileNo = mobileNo;
    }

    public void displayCustomer() {
        System.out.println("Mall Name: " + mallName);
        System.out.println("Mall Location: " + mallLocation);
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Mobile No: " + mobileNo);
    }

    class AnnualPayCard {
        private int cardId;
        private String expiry = "July 2028";
        private double balance;

        AnnualPayCard() {

        }

        AnnualPayCard(int cardId, double balance) {
            this.cardId = cardId;
            this.balance = balance;
        }

        void displayAnnualPayCard(){
            System.out.println("Card ID: "+cardId);
            System.out.println("Expiry: "+expiry);
            System.out.println("Balance: "+balance);
        }

        void displayBoth(){
            displayCustomer();
            displayAnnualPayCard();
        }

    }

}

public class Mall {
    public static void main(String[] args) {
        LifeStyle l1=new LifeStyle(101, "Shubham", 9373);
        l1.displayCustomer();
        System.out.println("-------------------------------");
        
        LifeStyle.AnnualPayCard a1=l1.new AnnualPayCard(1, 52000);
        //a1.displayAnnualPayCard();
        System.out.println("-------------------------------");
        a1.displayBoth();
        System.out.println("-------------------------------");

        System.out.println("-------------------------------");
        LifeStyle.AnnualPayCard a2=new LifeStyle(202, "Abhi", 99999).new AnnualPayCard(3, 60000);
        //a2.displayAnnualPayCard();
        System.out.println("-------------------------------");
        a2.displayBoth();
        System.out.println("-------------------------------");



    }
}
