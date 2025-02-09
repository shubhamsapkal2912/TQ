import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MultiCatch {
	public static void main(String[] args) {
		
     Scanner sc= new Scanner(System.in);
		
		try
		{
			int arr[]= new int[3];
			for (int i = 0; i <= arr.length; i++) {
				System.out.println("Enter a number:");
				arr[i] = sc.nextInt();
			}
			System.out.println(Arrays.toString(arr));
			System.out.println("----------------------------");
			for (int i = 0; i < arr.length; i++) {
				System.out.println(100/arr[i]);
			}
			
		}
		// rest of the catch--> unreachable- error
//		catch(Exception e)
//		{
//			System.out.println(e);
//		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
			System.out.println("eror:arrays is above the range..");
		}
//		catch(InputMismatchException e)
//		{
//			System.out.println(e);
//			System.out.println("error: Check your input, it should be integer");
//		}
		catch (ArithmeticException e) {
			System.out.println(e);
			System.out.println("Error:Array elements cannot be zero");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		finally {
			sc.close();
		}
		
		
	}

}
