import java.util.Arrays;

public class ArrayCreate3 {
    public static void main(String[] args) {
        int ar[]={1,2,3,4,5};
        System.out.println("Aray is:");
        for (int i = 0; i < ar.length; i++) {
            System.out.println(ar[i]);
       }
       System.out.println(ar);//hascode;
       System.out.println(Arrays.toString(ar));

       //anonymous array
       System.out.println(new int[] {1,2,3,4});
       System.out.println(Arrays.toString(new int[] {1,2,3,4}));
    }
}
