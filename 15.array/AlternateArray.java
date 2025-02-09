import java.util.Scanner;

public class AlternateArray {

    static void alternateArrayElements(int ar[]){
        System.out.println("Alternate Array");
        for (int i = 0; i < ar.length; i+=2) {
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
        alternateArrayElements(ar);
        
        sc.close();
    }
}
