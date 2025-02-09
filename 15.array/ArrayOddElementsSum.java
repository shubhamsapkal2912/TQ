import java.util.Scanner;

public class ArrayOddElementsSum {
    static int oddArraySum(int ar[]){
        
        int sum=0;
        for (int i = 0; i < ar.length; i++) {
            if (ar[i] % 2 != 0) {
                sum+=ar[i];
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elemnts in array: ");
        int size = sc.nextInt();

        int ar[] = new int[size];
        System.out.println("Enter Elements");
        for (int i = 0; i < ar.length; i++) {
            ar[i] = sc.nextInt();
        }
        int result=oddArraySum(ar);
        System.out.println(result);
        sc.close();
    }
}
