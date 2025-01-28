interface Payment {
    void pay(double amount);
}

public class PaymentDemo {
    public static void main(String[] args) {
        Payment cashPay = new Payment() {
            @Override
            public void pay(double amount) {
                System.out.println("Paid using cash: " + amount);
            }
        };

        Payment creditCard = new Payment() {
            @Override
            public void pay(double amount) {
                System.out.println("You got 10% discount: ");
                amount = amount - (amount * 0.10);
                System.out.println("Paid using Credit Card: " + amount);
            }
        };

        Payment debitCard = new Payment() {
            @Override
            public void pay(double amount) {
                if (amount > 2000) {
                    System.out.println("CashBack of 500rs");
                    amount = amount - 500;
                }
                System.out.println("Paid using debitCard: " + amount);
            }
        };

        cashPay.pay(20000);
        creditCard.pay(300);
        debitCard.pay(1235);
    }
}
