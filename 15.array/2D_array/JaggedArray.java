import java.util.Scanner;

public class JaggedArray {
    static Scanner sc=new Scanner(System.in);
    static void displayArr(int arr[][]){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int jarr[][]={{1,2},{4,2,1,5},{5,3,7,2},{7,5,4,2}};
        displayArr(jarr);

        int jar[][]=new int[4][];
        jar[0]=new int[2];
        jar[1]=new int[4];
        jar[2]=new int[1];
        jar[3]=new int[7];

        for(int i=0;i<jar.length;i++){
            System.out.println("Enter Values for row : " + (i + 1));
            for(int j=0;j<jar[i].length;j++){
                jar[i][j]=sc.nextInt();
            }
            System.out.println();
        }
        displayArr(jar);
    }
}
