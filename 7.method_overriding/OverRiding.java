class Parent {

    public void display() {
        System.out.println("Parent Class Display Method");
    }

    static void look() {
        System.out.println("In look method:---->static");
    }

    private void method1() {
        System.out.println("In method 1 ----->private");
    }
}

class Child extends Parent {
    void show() {
        System.out.println("Welcome to child");
    }
    @Override
    public void display() {
        System.out.println("Child Class Display Method");
    }

    // @Override
    // void method1(){
    //     System.out.println("hello");
    // }

    static void look() {
        System.out.println("In look method of child:---->static");
    }

}

public class OverRiding {

    public static void main(String[] args) {
        Child c1=new Child();
        c1.display();
        //c1.method1();
        c1.look();
    }
}