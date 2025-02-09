import java.util.Scanner;

public class MinimumOfRow {
    /*
     * static void minimum(int arr[][],int rows,int cols){
     * int min=arr[0][0];
     * for (int i = 0; i < rows; i++) {
     * 
     * for (int j = 0; j < cols; j++) {
     * if(arr[i][j]<min){
     * min=arr[i][j];
     * }
     * }
     * System.out.println("Minmum" + (i + 1));
     * System.out.println(min);
     * }
     * }
     */

    static void findMinimum(int arr[]) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Minimum "+min);
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
        System.out.println("--------------");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {

                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        //minimum(arr, rows, cols);
        for (int i = 0; i < arr.length; i++) {
            findMinimum(arr[i]);
        }
        sc.close();
    }
}
