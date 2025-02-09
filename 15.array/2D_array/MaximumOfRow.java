import java.util.Scanner;

public class MaximumOfRow {
    static void findMax(int arr[]) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Maximum "+max);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Rows");
        int rows = sc.nextInt();
        System.out.println("Enter Cols");
        int cols = sc.nextInt();

        int[][] arr = new int[rows][cols];
        System.out.println("Enter Array");
        for (int i = 0; i < rows; i++) {
            System.out.println("Enter Values for row : " + (i + 1));
            for (int j = 0; j < cols; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        //minimum(arr, rows, cols);
        for (int i = 0; i < arr.length; i++) {
            findMax(arr[i]);
        }
        sc.close();
    }
}
