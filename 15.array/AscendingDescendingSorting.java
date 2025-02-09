import java.util.Arrays;

public class AscendingDescendingSorting {

    public static void ascendingDescendingSort(int arr[]){
        for(int i=0;i<arr.length/2;i++){
            for(int j=i+1;j<arr.length/2;j++){
                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        for(int i=arr.length/2;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
    }
    public static void main(String[] args) {

        int arr[]={2,1,4,6,2,8,9};
        // for(int i=0;i<arr.length;i++){
        //     System.out.println(arr[i]);
        // }
        System.out.println("Before sorting"+Arrays.toString(arr));
        ascendingDescendingSort(arr);
        
        System.out.println("After sorting"+Arrays.toString(arr));
        // for(int i=0;i<arr.length;i++){
        //     System.out.println(arr[i]);
        // }

    }
}
