interface Flyable{
    void fly_obj();
}

class Spacecraft implements Flyable{
    public void fly_obj(){
        System.out.println("Space craft is in the space:");
    }
}
class Airplane implements Flyable{
    public void fly_obj(){
        System.out.println("Airplane is in the Air:");
    }
}
class Helicopter implements Flyable{
    public void fly_obj(){
        System.out.println("Helicopter is Flying");
    }
}
public class FlyableDemo {
    public static void main(String[] args) {
        Flyable f;
        f=new Spacecraft();
        f.fly_obj();
        System.out.println("-----------");
        f=new Airplane();
        f.fly_obj();
        System.out.println("-----------");
        f=new Helicopter();
        f.fly_obj();
        System.out.println("-----------");
    }
}
