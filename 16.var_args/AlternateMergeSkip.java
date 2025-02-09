import java.util.Arrays;

public class AlternateMergeSkip {
    public static int[] alternateMergeSkip(int arr1[], int arr2[]) {

        int maxLength = Math.max(arr1.length, arr2.length);
        int alternateMerge[] = new int[maxLength];
        int index = 0;
        int i = 0;
        while (index < maxLength) {
            if (i < arr1.length) {
                alternateMerge[index++] = arr1[i++];
            }
            if (i < arr2.length) {
                alternateMerge[index++] = arr2[i++];
            }
        }
        return alternateMerge;
    }

    public static void main(String[] args) {

        int arr1[] = { 1, 2, 3, 4, 5, 6 };
        int arr2[] = { 11, 25, 63, 64 };
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        int merge[] = alternateMergeSkip(arr1, arr2);
        System.out.println(Arrays.toString(merge));
    }
}