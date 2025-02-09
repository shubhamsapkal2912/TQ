import java.util.Scanner;

public class SumAndAverageOfElements {
    public static void cal(int ar[]){
int sum=0;
float avg=0;
        for (int i = 0; i < ar.length; i++) {
           sum+=ar[i];
        }
        avg=sum/ar.length;
       System.out.println("Sum is: "+sum);
       System.out.println("Avg is: "+avg);
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
      cal(ar);

        sc.close();
    }
}
