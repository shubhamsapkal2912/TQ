abstract class BankAccount {
    private int id;
    private String name;
    protected double balance;

    public BankAccount() {

    }

    public BankAccount(int id, String name,double amount) {
        this.id = id;
        this.name = name;
        this.balance=amount;

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

    abstract void deposit(double amount);

    abstract void withdraw(double amount);
}

class SavingsAccount extends BankAccount {

   
    public SavingsAccount() {

    }

    public SavingsAccount(int id, String name,double amount) {
        super(id, name,amount);
        
    }

    @Override
    void deposit(double amount) {
        if(amount>0){
            balance+=amount;
            System.out.println("Deposit of "+amount+" Successfull");
            System.out.println("Updated Balance is :"+balance);
        }
        else{
            System.out.println("Enter amt >0");
        }

    }

    @Override
    void withdraw(double amount) {
        if(amount>balance){
            System.out.println("Cannot withdraw :insufficient balance");
        }
        else{
            balance-=amount;
            System.out.println("Withdraw of "+amount+" Successfull");
            System.out.println("Updated Balance is :"+balance);

        }
        System.out.println(" in withdraw");

    }
    public String toString(){
        return "ID:"+getId()+", Name:"+getName()+", Balance:"+getBalance();
    }
}

class CurrentAccount extends BankAccount {

   
    public CurrentAccount() {

    }

    public CurrentAccount(int id, String name,double amount) {
        super(id, name,amount);
        
    }

    @Override
    void deposit(double amount) {
        if(amount>0){
            balance+=amount;
            System.out.println("Deposit of "+amount+" Successfull");
            System.out.println("Updated Balance is :"+balance);
        }
        else{
            System.out.println("Enter amt >0");
        }

    }

    @Override
    void withdraw(double amount) {
        if(amount>balance){
            System.out.println("Cannot withdraw :insufficient balance");
        }
        else{
            balance-=amount;
            System.out.println("Withdraw of "+amount+" Successfull");
            System.out.println("Updated Balance is :"+balance);

        }
        System.out.println(" in withdraw");

    }
    public String toString(){
        return "ID:"+getId()+", Name:"+getName()+", Balance:"+getBalance();
    }
}

public class Bank {
    public static void main(String[] args) {
        BankAccount b1;
        b1=new SavingsAccount(1,"Shubham",100);
        System.out.println(b1);
        b1.deposit(10000);
        System.out.println(b1);
        System.out.println("-------------------------------");

        b1=new SavingsAccount(101,"Abhi",100);
        System.out.println(b1);
        b1.deposit(10000);
        System.out.println(b1);

    }
}
