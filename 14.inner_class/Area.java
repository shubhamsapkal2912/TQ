interface Shapes{
    public void calArea();
}
public class Area {
    public static void main(String[] args) {
        Shapes square = new Shapes() {
            double side=5;
            @Override
            public void calArea(){
                System.out.println("In square");
                System.out.println("Area is "+side*side);
            }
        };
        Shapes rectangle = new Shapes() {
            double lenght=5;
            double breadth=7;
            @Override
            public void calArea(){
                System.out.println("In rectangle");
                System.out.println("Area is "+lenght*breadth);
            }
        };
        Shapes triangle = new Shapes() {
            double height=5;
            double base=7;
            @Override
            public void calArea(){
                System.out.println("In triangle");
                System.out.println("area is "+(0.5)*base*height);
            }
        };
        square.calArea();
        rectangle.calArea();
        triangle.calArea();
    }
}
