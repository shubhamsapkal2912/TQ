public class Array2D1 {
    public static void main(String[] args) {
        int arr[][]={{1,1},{2,2},{3,3},{4,4}};

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
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
