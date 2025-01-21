class BankAccount {
    private int id;
    private String name;
    private double balance;

    BankAccount() {
        System.out.println("In bank default constructor.");
    }

    BankAccount(int id, String name, double balance) {
        this.id = id;
        this.name = name;
        if (balance > 50000) {
            System.out.println("Please Enter balance less than 50k");
            this.balance=0.0;
        } else {

            this.balance = balance;
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit of " + amount + " Successful : ");
            System.out.println("Updated Balance is:" + balance);
        } else {
            System.out.println("Cannot deposit < 0 amount");
        }
    }

    public void withdraw(double amount) {
        if ((amount > 0) && (amount <= balance)) {
            balance -= amount;
            System.out.println("Withdraw of " + amount + " Successful ");
            System.out.println("Updated Balance is:" + balance);
        } else {
            System.out.println("Cannot withdraw less balance");
        }
    }

    public String toString() {
        return "ID:" + id + " Name:" + name + " Balance:" + balance;
    }
}

class SavingsAccount extends BankAccount {
    String panNo;

    SavingsAccount() {
        System.out.println("saving account default constructor...");
    }

    SavingsAccount(int id, String name, double balance) {
        super(id, name, balance);
    }

    SavingsAccount(int id, String name, double balance, String panNo) {
        super(id, name, balance);
        this.panNo = panNo;
    }
    @Override
    public void withdraw(double amount) {
        if (getBalance() - amount < 1000) {
            System.out.println("Cannot withdraw balance below 1k");
        } else {
            super.withdraw(amount);
        }
    }
    @Override
    public void deposit(double amount) {
        if ((getBalance()+amount > 50000) && (panNo == null)) {
            System.out.println("Deposit failed ----> Provide pan no");
        } else {
            super.deposit(amount);
        }
    }

    @Override
    public String toString() {
        return "Id: " + getId() + "Name:" + getName() + "Balance:" + getBalance();
    }

    public String getPanNo() {
        return panNo;
    }

    public void setPanNo(String panNo) {
        this.panNo = panNo;
    }

}

public class Bank {

    public static void main(String[] args) {
        //BankAccount b1 = new BankAccount(1, "shubham", 9000);
       // BankAccount b2 = new BankAccount(2, "abhi", 91000);
         //System.out.println(b1);
        // System.out.println(b2);

        SavingsAccount s1 = new SavingsAccount(1, "Shubham", 49000);
        s1.setPanNo("1NPs2002");
        s1.deposit(10000);
       // System.out.println(s1);
        // SavingsAccount s2=new SavingsAccount(2, "Abhi", 91000);
        // SavingsAccount s3=new SavingsAccount(3, "Abhi", 91000,"nulp12dgy");
        // System.out.println(s2);
        // System.out.println(s3);
        // s3.deposit(51000);
        // s1.withdraw(1000);
        // s1.withdraw(90000);

    }
}