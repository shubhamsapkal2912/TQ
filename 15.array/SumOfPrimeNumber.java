import java.util.Scanner;

public class SumOfPrimeNumber {
    public static int sumPrime(int ar[]){
        int ans=0;
        for (int i = 0; i < ar.length; i++) {
            boolean isPrime=true;
            for(int j=2;j<ar[i];j++){

                if(ar[i]%j==0){
                    isPrime=false;
                    break;
                }
            }
            if(isPrime){
                ans+=ar[i];
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
        System.out.println("Sum of Prime numbers is: "+sumPrime(ar));

        sc.close();
    }
}
