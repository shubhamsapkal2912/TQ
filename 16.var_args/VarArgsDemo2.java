public class VarArgsDemo2 {

    static void method1(int n1, int n2) {
        System.out.println(n1 + n2);
    }

    static void method1(int n1, int n2, int n3) {
        System.out.println(n1 + n2 + n3);
    }

    static void method2(int... arr) {
        int sum = 0;
        for (int x : arr) {
            sum += x;
        }
        System.out.println(sum);
    }

    /*
     * Rule 1: there can be only 1 varargs in method
     * static void display(int... arr, int... arg2) {
     * for (int x : arr) {
     * System.out.print(x + " ");
     * }
     * System.out.println();
     * }
     */

    // Rule 2: VarArgs must be last argument in method
    static void display(int a, int num, String... arr) {
        System.out.println(a);
        System.out.println(num);
        for (String x : arr) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    //NOTE : We can overload varargs

    static void display(int a, int num, int... arr)// VarArgs
    {
        System.out.println(a);
        System.out.println(num);
        for (int x : arr) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    public static void main(String... args) {

       // method1(6, 8);
        //method1(3, 2, 10);

       // method2(2, 4, 5, 1, 6, 7, 9);

        //display(1, 4, "Shubham", "Ronit", "Abhishek", "Aditya");
        display(4, 7, "Rohan");

        display(2, 5, 3,2,5,5);
    }
}