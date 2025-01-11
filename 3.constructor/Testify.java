package constructor;

public class Testify {
    String name;

    //Default constructor
    Testify() {
        System.out.println("In Default COnstructor");
    }
    
    //Parameterized constructor
    Testify(String name) {
        this.name = name;
        System.out.println("In Parameterized constructor");
    }
    void display(){
        System.out.println("Hii :"+name);
        // show();
        // this.show();
    }

    void show(){
        System.out.println("Welcome to TQ");
    }
    Testify changeName(){
name=name+"TQ";
return this;
    }

    public static void main(String[] args) {
        Testify t1 = new Testify();
        // System.out.println(t1.name);
        // Testify t2 = new Testify("Shubham");
        // System.out.println(t2.name);
        // t2.display();
        //t2.show();
        Testify dummy;
        dummy=t1.changeName();
        dummy.display();
    }
}
