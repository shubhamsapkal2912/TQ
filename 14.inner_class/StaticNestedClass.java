class Outer2{
    static int value=90;
    int data=69;

    void display(){
        System.out.println("Outer Value: "+value);
        System.out.println("Outer Data: "+data);
    }

    static class Inner2{
        String msg1="Hello";
        static String msg2="Welcome";

        void show(){
            System.out.println("Outer value: "+value);
            //System.out.println("Outer data: "+data);
            //display();
            System.out.println("Inner msg1: "+msg1);
            System.out.println("Inner msg2: "+msg2);

            Outer2 o1=new Outer2();
            System.out.println("Outer Data: "+o1.data);
            o1.display();
        }
        static void method1(){
            System.out.println("Outer value: "+value);
            //System.out.println("Outer data: "+data);

            //System.out.println("Inner msg1: "+msg1);
            System.out.println("Inner msg2: "+msg2);

            Outer2 o1=new Outer2();
            System.out.println("Outer Data: "+o1.data);
            o1.display();

        }
    }
}
public class StaticNestedClass
{
    public static void main(String[] args) {
        
        Outer2.Inner2 inobj=new Outer2.Inner2();
        inobj.show();
        //inobj.method1();
        Outer2.Inner2.method1();
    }
}