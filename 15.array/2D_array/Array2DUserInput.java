import java.util.Scanner;

public class Array2DUserInput {
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
        sc.close();
    }
}
