import java.util.Scanner;

public class SumOfEachColumns {
    static int findSumOfColumn(int arr[]) {
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
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

       
        for (int i = 0; i < cols; i++) {
            int[] colArray = new int[rows]; 
            for (int j = 0; j < rows; j++) {
                colArray[j] = arr[j][i]; 
            }
            int ans=findSumOfColumn(colArray);
            System.out.println("Sum of " + (i + 1) + " col is " + ans);
        }

        sc.close();
    }
}
