public class TypePromotion {
    static void printMe(float n){
        System.out.println("In Float");
        System.out.println(n);
    }
    static void printMe(long n){
        System.out.println("In Long");
        System.out.println(n);
    }
    public static void main(String[] args) {
        printMe(1111.34f);
        printMe(1111);
    }
}
