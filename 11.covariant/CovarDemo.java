class Car{

    Car get(){
        System.out.println("in Car Class");
        return  new Car();
    }
}
class BMW extends Car{
    // Car get(){
    //     System.out.println("in BMW Class");
    //     return  new Car();
    // }
    BMW get(){
        System.out.println("in BMW Class");
        return  new BMW();
    }
}

public class CovarDemo{
    public static void main(String[] args) {
        BMW b1= new BMW();
        Car b2=new Car();
        //b2=(BMW)b1.get();
        b2.get();
        b1.get();

    }
}