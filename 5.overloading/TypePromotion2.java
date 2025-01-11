public class TypePromotion2 {

    static void display(int n){
        System.out.println("In INT");
        System.out.println(n);
    }
    static void display(float n){
        System.out.println("In float");
        System.out.println(n);
    }
    static void display(double n){
        System.out.println("In Double");
        System.out.println(n);
    }
    public static void main(String[] args) {
        //int ,long,float,double
        display(5);
        display(5.55);
        display('A');
    }
}
