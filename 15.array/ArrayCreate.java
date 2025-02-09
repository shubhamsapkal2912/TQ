import java.util.Scanner;

public class ArrayCreate {

    public static void main(String[] args) {
        int ar[] = new int[5];
        // length =5
        // index starts from 0 to arr length-1
        // ar[0] = 0;
        // ar[1] = 10;
        // ar[2] = 20;
        // ar[3] = 30;
        System.out.println(ar[1]);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter element  ");
        for (int i = 0; i < ar.length; i++) {
            ar[i] = sc.nextInt();
        }
        for (int i = 0; i < ar.length; i++) {
             System.out.println(ar[i]);
        }

        sc.close();

    }
}