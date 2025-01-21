class Car {
    int model;
    String name;
    double price;

    Car() {

    }

    Car(int model, String name, double price) {
        this.model = model;
        this.name = name;
        this.price = price;
    }

    public Car displayDetails() {
        System.out.println("In car class");
        return new Car(model, name, price);
    }

    public String toString() {
        return "Model:" + model + " Name :" + name + " Price:" + price;
    }
}

class Suv extends Car {

    Suv() {

    }

    Suv(int model, String name, double price) {
        super(model, name, price);
    }
    public Suv displayDetails(){
        System.out.println("In SUV Class");
    return new Suv(2,"HArrier",219999);
    }

    // public Car displayDetails() {
    //     System.out.println("In car Class");
    //     return new Car(model, name, price);
    // }

    public String toString() {
        return super.toString();
    }

}

public class Automobile {
    public static void main(String[] args) {

        Car c1=new Car(2, "PUNCH", 600000);
        System.out.println(c1.displayDetails());

        Suv s1 = new Suv(1, "NEXON", 899990);
        System.out.println(s1.displayDetails());
        // System.out.println(s1);

    }
}
