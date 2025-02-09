import java.util.Arrays;

public class AlternateMerge {
    public static int[] alternateMerge(int arr1[], int arr2[]) {
        int size1 = arr1.length;
        int size2 = arr2.length;

        int alternateMerge[] = new int[size1 + size2];

        int i = 0;
        int j = 0;
        int index = 0;
        for (i = 0, j = 0; (i < size1) && (j < size2); i++, j++) {
            alternateMerge[index++] = arr1[i];
            alternateMerge[index++] = arr2[j];
        }

        while (i < size1) {
            alternateMerge[index++] = arr1[i++];
        }
        while (j < size2) {
            alternateMerge[index++] = arr2[j++];
        }

        return alternateMerge;
    }

    public static void main(String[] args) {

        int arr1[] = { 1, 2, 3, 4, 5, 6 };
        int arr2[] = { 11, 25, 63, 64 };
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        int merge[] = alternateMerge(arr1, arr2);
        System.out.println(Arrays.toString(merge));
    }
}