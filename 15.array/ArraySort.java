import java.util.Arrays;
import java.util.Scanner;

public class ArraySort {
    public static void sort(int arr[]) {
        System.out.println("----------------");
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[i]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
                System.out.println("Array : "+Arrays.toString(arr));
            }
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
        System.out.println("Before Sorting " + Arrays.toString(ar));
        sort(ar);
        System.out.println("After Sorting " + Arrays.toString(ar));
        sc.close();
    }
}
