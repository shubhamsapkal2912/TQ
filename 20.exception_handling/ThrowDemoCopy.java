

import java.util.Scanner;

public class ThrowDemoCopy {
	
	public static void main(String[] args) {
		
Scanner sc= new Scanner(System.in);
		
			System.out.println("Enter your age:");
			int age= sc.nextInt();
			if(age<18)
				throw new RuntimeException("Age should be greater than 18..");
			System.out.println("Voting day: 5thFeb Poll: 2");
						
		
			sc.close();	
			
		
		System.out.println("Voting ends..");
		
	}
}
