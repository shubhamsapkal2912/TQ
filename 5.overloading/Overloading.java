public class Overloading {

    public static int add(int iNum1, int iNum2) {
        return iNum1 + iNum2;
    }

    public static void add(int num1, int num2, int num3) {
        int ans = num1 + num2 + num3;
        System.out.println(ans);
    }

    public static void main(String[] args) {
        int ans1 = add(12, 10);
        System.out.println(ans1);
        add(10, 20, 30);
    }
}