class Parent{
    int id;
    String name;
    String course="GO";

    Parent(){

    }
    Parent(int id,String name){
       this.id=id;
       this.name=name; 
    }
    public void display(){
        System.out.println(id);
        System.out.println(name);
    }
}
class Child extends Parent{
    String course;
    Child(){
        super();
    }
    Child(int id,String name,String course){
        super(id,name);
        this.course=course;
    }
    public void show(){
        course="Andriod";
        System.out.println(course);
        System.out.println(this.course);
        System.out.println(super.course);
    }
    public void display(){
        super.display();
        System.out.println(course);
        System.out.println("in child class");
    }
}
public class SuperDemo {
    public static void main(String[] args) {
        Child c1=new Child(1, "shubham", "Python");
        c1.show();
       // c1.display();
    }
}
