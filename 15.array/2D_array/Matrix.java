import java.util.Scanner;

public class Matrix {
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


    static void difference(int rows1 ,int cols1,int rows2,int cols2){
        int arr1[][]=new int[rows1][cols1];
        int arr2[][]=new int[rows2][cols2];

        int arr3[][]=new int[rows1][cols1];

        for(int i=0;i<rows1;i++){
            for(int j=0;j<cols1;j++){
                arr3[i][j]=arr1[i][j]-arr2[i][j];
            }
        }
        displayArr(arr3);
    }

    static void add(int rows1 ,int cols1,int rows2,int cols2){
        int arr1[][]=new int[rows1][cols1];
        int arr2[][]=new int[rows2][cols2];

        int arr3[][]=new int[rows1][cols1];

        for(int i=0;i<rows1;i++){
            for(int j=0;j<cols1;j++){
                arr3[i][j]=arr1[i][j]+arr2[i][j];
            }
        }
        displayArr(arr3);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Rows for 1 matrix");
        int rows1 = sc.nextInt();
        System.out.println("Enter Cols for 1 matrix");
        int cols1 = sc.nextInt();

        System.out.println("Enter Rows for 2 matrix");
        int rows2 = sc.nextInt();
        System.out.println("Enter Cols for 2 matrix");
        int cols2 = sc.nextInt();

    }
}
