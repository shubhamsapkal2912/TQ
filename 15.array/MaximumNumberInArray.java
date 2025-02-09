import java.util.Scanner;

public class MaximumNumberInArray {
    static int maxNumber(int ar[]){
        int maxNumber=ar[0];
        for (int i = 1; i < ar.length; i++) {
           if(ar[i]>maxNumber){
            maxNumber=ar[i];
           }
         }
         return maxNumber;
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
        int ans=maxNumber(ar);

        System.out.println("Maximum number is :"+ans);
        sc.close();
    }
}
