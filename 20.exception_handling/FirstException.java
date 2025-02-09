import java.util.Scanner;

public class FirstException {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter num1:");
        int a=sc.nextInt();
        System.out.println("Enter num2:");
        int b=sc.nextInt();

        try{
            float div=a/b;
            System.out.println(div);
        }
        catch(ArithmeticException e){
            System.out.println(e);
            e.printStackTrace();
        }

        finally{
            sc.close();
            System.out.println("Div code ends here...");

        }
        System.out.println("After try catch");
        int add=a+b;
        System.out.println(add);

    }
}