import java.util.Scanner;

public class CubeOfElements {
    static void cubeOfArrayElemnts(int ar[]) {
System.out.println("Cubes:");
        for (int i = 0; i < ar.length; i++) {
            System.out.println(ar[i] * ar[i] * ar[i]);
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
        cubeOfArrayElemnts(ar);

        sc.close();
    }
}
