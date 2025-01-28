interface Doable{
    public void doIt();
}

class Car{
    public void drive(){
        System.out.println("I am driving a car : ");
    }
}
abstract class Cake{
    abstract void doBaking();
}
public class AnoymousInnerClassDemo {
    public static void main(String[] args) {
        //using interface
        Doable d1= new Doable() {
            @Override
            public void doIt(){
                System.out.println("I am drawing");
            }
        };
        d1.doIt();

       //class
       Car c1=new Car();
       c1.drive();

       Car c2=new Car(){
        public void drive(){
            System.out.println("I am driving a BMW : ");
        }
       };
       c2.drive();

       Cake ck=new Cake() {
        @Override
        void doBaking(){
            System.out.println("I am baking toast");
        }
       };
       ck.doBaking();
    }
}
