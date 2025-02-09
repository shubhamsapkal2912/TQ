import java.util.Scanner;

public class EvenArray {

    static void evenArray(int ar[]){
        System.out.println("Even Aray elemnts");
        for (int i = 0; i < ar.length; i++) {
            if (ar[i] % 2 == 0) {
                System.out.println(ar[i]);
            }
        }
    }
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

        evenArray(ar);

        sc.close();
    }
}