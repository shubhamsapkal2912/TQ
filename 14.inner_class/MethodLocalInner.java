class Outer1{
    private static int data=10;
    private int value=100;

    void display(){

        class Inner1{
            private int value1=90;

            static void show(){
                System.out.println("Data: "+data);
                // System.out.println("Value: "+value);
                // System.out.println("Value: "+value1);
            }

            void display(){
                System.out.println("Data: "+data);
                System.out.println("Value: "+value);
                System.out.println("Value1: "+value1);
            }

        }///inner class end

        Inner1 i1=new Inner1();
        i1.display();
        Inner1.show();
    }
}

public class MethodLocalInner {
    public static void main(String[] args) {
        Outer1 o1=new Outer1();
        o1.display();

    }
}
