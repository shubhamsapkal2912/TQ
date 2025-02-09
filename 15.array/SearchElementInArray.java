import java.util.Scanner;

public class SearchElementInArray {
    static boolean search(int ar[], int search) {
    boolean ans=false;
        for (int i = 0; i < ar.length; i++) {
          if(ar[i]==search){
            ans=true;
            break;
          }
        }
        return ans;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elemnts in array: ");
        int size = sc.nextInt();

        int ar[] = new int[size];
        System.out.println("Enter Elements");
        for (int i = 0; i < ar.length; i++) {
            ar[i] = sc.nextInt();
        }
        System.out.println("Enter number to search: ");
        int search=sc.nextInt();
       if(search(ar, search)){
        System.out.println("Element Present");
    }
    else{
           System.out.println(" Element Not Present");

       }
        sc.close();
    }
}
