public class VarArgsDemo {

//ellipsis
    static void display(int... arr)//VarArgs
     {
        for (int x : arr) {
            System.out.print(x+" ");
        }
        System.out.println();
    }

    public static void main(String... args) {
        int arr1[] = { 2, 3, 1, 5, 7 };
        int arr2[] = { 5, 2, 4 };
        int arr3[] = { 16, 59, 2, 18 };
        display(arr1);
        display(arr2);
        display(arr3);

    }
}