abstract class Loan{
private double rate;
Loan(){

}
Loan(double rate){
 this.rate=rate;   
}
public double getRate(){
    return rate;
}
abstract void policyRules();
static void show(){
    System.out.println("Bank Of India");
}
void display(){
    System.out.println("IFSC: 19918289");
}
final void calcEMI(double amount, double timeSpan)
    {
    	double emi;
         
         rate = rate / (12 * 100); // one month interest
         timeSpan = timeSpan * 12; // one month period
         emi = (amount * rate * (float)Math.pow(1 + rate, timeSpan)) 
                 / (float)(Math.pow(1 + rate, timeSpan) - 1);
         
         System.out.println("Emi of loan for one month :"+emi);
    }

}

class HomeLoan extends Loan{
HomeLoan(){
super();
}
HomeLoan(double rate){
  super(rate);  
}

@Override
	void policyRules() {
		System.out.println("1. Home should be on your name");
		System.out.println("2. It should not under construction");
		System.out.println("3. Applicable for max 20 years");
		//rate=8.5;
		System.out.println("4. Rate of interest:"+getRate());
			
	}

}

public class AbstractDemo1 {
    public static void main(String[] args) {
        Loan l1;
        l1=new HomeLoan(8.5);
        l1.policyRules();
        l1.calcEMI(30000, 10);
        l1.show();
        l1.display();
        
    }
}
