import java.util.Scanner;

public class Transpose {
    static void displayArr(int arr[][]) {
        int rows = arr.length;
        int cols = arr[0].length;
        System.out.println("--------------");
        System.out.println("Entered Array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }

    static int[][] transpose(int arr[][]) {
        int rows = arr.length;
        int cols = arr[0].length;

        int transpose[][] = new int[cols][rows];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                transpose[j][i] = arr[i][j];
            }
        }
        return transpose;
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
        displayArr(arr);
        int tarr[][] = transpose(arr);
        displayArr(tarr);
        sc.close();
    }
}
