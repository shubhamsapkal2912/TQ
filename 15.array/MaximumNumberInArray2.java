import java.util.Scanner;

public class MaximumNumberInArray2 {
    static int maxNumber(int ar[]){
        int maxNumber1=ar[0];
        int maxNumber2=ar[0];

        for (int i = 1; i < ar.length; i++) {
           if(ar[i]>maxNumber1){
            maxNumber1=ar[i];
        }
         }

        for (int i = 1; i < ar.length; i++) {
            if((ar[i]>maxNumber2)&&(ar[i]<maxNumber1)){
             maxNumber2=ar[i];
         }
          }
         return maxNumber2;
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

        System.out.println("2nd Maximum number is :"+ans);
        sc.close();
    }
}
