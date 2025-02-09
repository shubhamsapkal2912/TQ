import java.util.Scanner;

public class ReverseArray {
    static void reverseArray(int ar[]){
        for (int i = ar.length; i >=0; i++) {
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

       
sc.close();
    }
}
