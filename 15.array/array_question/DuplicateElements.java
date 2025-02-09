import java.util.Arrays;

public class DuplicateElements {

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 3, 2, 4, 6, 7, 8, 3 };
        int []temp;
        int count=0;
        boolean []duplicate=new boolean[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if(!duplicate[i]){
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] == arr[j]) {
                        duplicate[j]=true;
                    }
            }
            count++;
            }
            
        }
        System.out.println(count);
        System.out.println(Arrays.toString(arr));
        int index=0;
        int []arr2=new int[count];
        for (int i = 0; i < arr.length; i++) {
                if(!duplicate[i]){
                    arr2[index++]=arr[i];   
            }
        }
        System.out.println("Unique Elements");
        System.out.println(Arrays.toString(arr2));

       

    }
}