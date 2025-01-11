public class TypePromotionAmb {
static void add(int n1,double n2){
    System.out.println("In Method 1");
    System.out.println((n1+n2));
}
static void add(long n1,float n2){
    System.out.println("In Method 1");
    System.out.println((n1+n2));
}
    public static void main(String[] args) {
        //add(1,3.8f);//ambiguos

        add(11,2.3);
    }
}