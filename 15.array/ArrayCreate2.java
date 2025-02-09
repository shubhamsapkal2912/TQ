import java.util.Scanner;

public class ArrayCreate2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elemnts in array: ");
        int size = sc.nextInt();
        // sc.next();

        int ar[] = new int[size];
        System.out.println("Enter Elements");
        for (int i = 0; i < ar.length; i++) {
            ar[i] = sc.nextInt();
        }
        for (int i = 0; i < ar.length; i++) {
            System.out.println(ar[i]);
        }
        sc.close();
    }
}
