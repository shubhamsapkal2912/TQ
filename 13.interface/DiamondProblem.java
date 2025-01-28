interface GrandParent{
void display();
default void show(){
    System.out.println("In grandparent");
}
}

interface Father extends GrandParent{
    default void show(){
        System.out.println("In Father");
    }
}
interface Mother extends GrandParent{
    default void show(){
        System.out.println("In Mother");
    }
}
class Child implements Father,Mother{
    public void display(){
        System.out.println("In Child class");
    }
    public void show(){
        Father.super.show();
        Mother.super.show();
        System.out.println("In Child ");
    }
}

public class DiamondProblem {
    public static void main(String[] args) {
        GrandParent c= new Child();
		c.show();
		c.display();
    }
}
