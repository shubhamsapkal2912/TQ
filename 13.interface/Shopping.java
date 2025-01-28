//package com.interfacedemo;

interface PaymentService {

	boolean doTransaction(float amount);

}

class CreditCard implements PaymentService
{

	private int cardNo;
	private int cvv;
	private double limit;

	public CreditCard() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CreditCard(int cardNo, int cvv, double limit) {
		super();
		this.cardNo = cardNo;
		this.cvv = cvv;
		this.limit = limit;
	}

	@Override
	public boolean doTransaction(float amount) {

		if ((limit - amount) > 0) {
			System.out.println("Credit card is debited by :" + amount);
			this.limit -= amount;
			return true;
		}

		else {
			System.out.println("Overlimit,,,, Credit limit:" + limit);
			return false;
		}

	}

	public int getCardNo() {
		return cardNo;
	}

	public void setCardNo(int cardNo) {
		this.cardNo = cardNo;
	}

	public int getCvv() {
		return cvv;
	}

	public void setCvv(int cvv) {
		this.cvv = cvv;
	}

	public double getLimit() {
		return limit;
	}

	public void setLimit(double limit) {
		this.limit = limit;
	}

}

class DebitCard implements PaymentService {
	private int cardNo;
	double balance;

	public DebitCard() {
		super();
		// TODO Auto-generated constructor stub
	}

	public DebitCard(int cardNo, double balance) {
		super();
		this.cardNo = cardNo;
		this.balance = balance;
	}

	@Override
	public boolean doTransaction(float amount) {
		
		if((this.balance- amount)>=1000)
		{
			System.out.println("Debit card is debited by :"+amount);
			this.balance-=amount;
			System.out.println("Balance left :"+this.balance);
			System.out.println("=====================================");
			return true;
		}
		
		else
		{
			System.out.println("Insufficient balance ,,,, Balance:"+balance);
			return false;
		}
		
		
	}

	public int getCardNo() {
		return cardNo;
	}

	public void setCardNo(int cardNo) {
		this.cardNo = cardNo;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	

}

public class Shopping {
	
	String name;
	long mobileNo;
	double bill;
	
	public Shopping() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Shopping(String name, long mobileNo) {
		super();
		this.name = name;
		this.mobileNo = mobileNo;
	}
	
//	public void payBill(CreditCard c, float amt)
//	{
//		c.doTransaction(amt);
//	}
	
	public void setBill(double bill) {
		this.bill = bill;
	}
	
	public void payBill(PaymentService p, float amt)
	{
		if(p.doTransaction(amt))
		{
			this.bill-=amt;
		}
		
		System.out.println("Bill to be paid:"+this.bill);
	}
	
	
	
	public void payBill(PaymentService p, float amt, float discount)
	{
		float totalamount=amt;
		amt= amt-((discount/100)*amt);
		if(p.doTransaction(amt))
		{
			this.bill-=totalamount;
		}
		System.out.println("Bill to be paid:"+this.bill);
	}
	
	public static void main(String[] args) {
		
	  Shopping s1= new Shopping("Bhaskar", 78653645);
	  
	  s1.setBill(70000);
	  
	  CreditCard c1= new CreditCard(6456, 123, 50000);
	  DebitCard d1= new DebitCard(7007, 35000);
	  
	  System.out.println("Total bill:"+ s1.bill);
	  System.out.println("-------------------------------");
	  s1.payBill(c1, 40000);
	  
	  System.out.println("----------------------------------");
	  s1.payBill(d1, 20000, 10);
	  
	  System.out.println("------------------------------");
	  s1.payBill(d1, 10000);
	  
	
	}

}