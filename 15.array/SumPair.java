import java.util.Scanner;

public class SumPair {
    public static void finPairs(int arr[],int num){
        boolean find=false;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==num){
                    System.out.println(arr[i]+"+"+arr[j]+"="+num);
                    find=true;
                    break;
                }
            }
        }
        if(!find){
            System.out.println("no pair found");
        }
    }
    public static void main(String[] args) {
        int arr[]={2,1,4,6,2,8};
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number ");
        int num=sc.nextInt();
        finPairs(arr, num);
        sc.close();
    }
}
