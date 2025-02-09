public class Array2D {
    public static void main(String[] args) {
        // int arr[][];
        int[][] arr;

        int rows = 3;
        int cols = 3;

        arr = new int[rows][cols];
        int no = 1;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = no;
                no++;
            }
        }

        System.out.println("--------------");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                
               System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
System.out.println("Enhanced For Loops");
        for(int []row: arr ){
            for(int x:row){
                System.out.print(x+" ");
            }
            System.out.println();
        }
    }
}