import java.util.Scanner;

public class Frequency {
    public static void frequency(int arr[]) {
        System.out.println("----------------");
        
        for (int i = 0; i < arr.length; i++) {
            boolean visited = false;
            
            // Check if the element has already been counted
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    visited = true;
                    break;
                }
            }

            if (!visited) {
                int count = 1; // Initialize with 1 to include the current element
                for (int k = i + 1; k < arr.length; k++) {
                    if (arr[i] == arr[k]) {
                        count++;
                    }
                }
                System.out.println(arr[i] + ": " + count);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array: ");
        int size = sc.nextInt();

        int ar[] = new int[size];
        System.out.println("Enter elements:");
        for (int i = 0; i < ar.length; i++) {
            ar[i] = sc.nextInt();
        }

        frequency(ar);
        sc.close();
    }
}
