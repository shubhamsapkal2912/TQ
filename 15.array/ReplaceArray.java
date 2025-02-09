import java.util.Arrays;
import java.util.Scanner;

public class ReplaceArray {
    static void replaceArrayElements(int ar[]){
       
        
        for (int i = 0; i < ar.length; i++) {
        if(ar[i]%10==9){
            ar[i]=0;
        }
        }
        System.out.println("After");
        for (int i = 0; i < ar.length; i++) {
            System.out.println(ar[i]);
        }
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
        System.out.println("Before");
        System.out.println(Arrays.toString(ar));
        replaceArrayElements(ar);
        
        sc.close();
    }
}
