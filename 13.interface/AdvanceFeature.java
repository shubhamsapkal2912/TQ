interface Calculate{

    void area();
    void perimeter();

    default void volume(){
        System.out.println("In Volume method for 3d shapes");
        display();
        show();
    }

    static void info(){
        System.out.println("Geometry shapes : ");
        show();
    }

    private void display(){
        System.out.println("Made in TQ");
    }
    private static void show(){
        System.out.println("PAN : nulps");
        //display();
    }
}

class Square implements Calculate{
    int side;
    Square(){

    }
Square(int side){
    this.side=side;    
    }
    public void area(){
        System.out.println("Area of Sqaure is : "+(side*side));
    }
    public void perimeter(){
        System.out.println("Perimeter of Sqaure is : "+(4*side));
    }

}

class Cube implements Calculate{
    int side;
    Cube(){

    }
    Cube(int side){
        this.side=side;
    }
    public void area(){
        System.out.println("Area of cube is : "+(6*side*side));
    }
    public void perimeter(){
        System.out.println("Perimeter of Sqaure is : "+(12*side));
    }
    public void volume(){
        System.out.println("Volume of Cube is : "+(side*side*side));
    }

}
public class AdvanceFeature {
    public static void main(String[] args) {
        Calculate c;
        System.out.println("Square");
        c=new Square(4);
        c.area();
		c.volume();
		c.perimeter();
        
        System.out.println("Cube");
        c=new Cube(5);
        c.area();
		c.volume();
		c.perimeter();

    }
}
