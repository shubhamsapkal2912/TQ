import java.util.Arrays;

public class CompleteMerge {
    public static int[] completeMerge(int arr1[], int arr2[]) {
        int merge_arr[] = new int[arr1.length + arr2.length];
        int index = 0;
        for (int i = 0; i < arr1.length; i++) {
            merge_arr[index] = arr1[i];
            index++;
        }
        for (int i = 0; i < arr2.length; i++) {
            merge_arr[index] = arr2[i];
            index++;
        }
        return merge_arr;
    }

    public static void main(String[] args) {
        int arr1[] = { 1, 2, 3, 4, 5, 6 };
        int arr2[] = { 11, 25, 63, 64 };
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        int merge[] = completeMerge(arr1, arr2);
        System.out.println(Arrays.toString(merge));

    }
}
