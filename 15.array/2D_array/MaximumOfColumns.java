import java.util.Scanner;

public class MaximumOfColumns {
    static void findMinimum(int arr[]) {
        int max = arr[0];
        for (int j = 1; j < arr.length; j++) { 
            if (arr[j] > max) {
                max = arr[j];
            }
        }
        System.out.println("Max: " + max);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Rows:");
        int rows = sc.nextInt();
        System.out.println("Enter Columns:");
        int cols = sc.nextInt();

        int[][] arr = new int[rows][cols];
        System.out.println("Enter Array:");
        for (int i = 0; i < rows; i++) {
            System.out.println("Enter Values for row " + (i + 1) + ":");
            for (int j = 0; j < cols; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        
        System.out.println("--------------");
        System.out.println("Entered Array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Minimum of each column:");
        for (int i = 0; i < cols; i++) {
            int[] colArray = new int[rows]; 
            for (int j = 0; j < rows; j++) {
                colArray[j] = arr[j][i]; 
            }
            findMinimum(colArray); 
        }

        sc.close();
    }
}
