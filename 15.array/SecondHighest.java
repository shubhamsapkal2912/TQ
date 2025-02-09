import java.util.Scanner;

public class SecondHighest {
    public static int secondHighestNumber(int arr[]){
int highest=arr[0];
int secondHighest=arr[0];
for(int i=0;i<arr.length;i++){
    if(arr[i]>highest){
        secondHighest=highest;
        highest=arr[i];
    }
    else if(arr[i]>secondHighest){
        secondHighest=arr[i];
    }
}
return secondHighest;
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
        int ans=secondHighestNumber(ar);

        System.out.println("2nd Maximum number is :"+ans);
        sc.close();
    }
}
