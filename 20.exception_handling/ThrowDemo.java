
import java.util.Scanner;

public class ThrowDemo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		try {
			System.out.println("Enter your age:");
			int age = sc.nextInt();
			if (age < 18)
				throw new Exception("Age should be greater than 18..");
			System.out.println("Voting day: 5thFeb Poll: 2");

		} catch (Exception e) {
			System.out.println(e);
		} finally {
			sc.close();
		}
		System.out.println("Voting ends..");

	}
}
