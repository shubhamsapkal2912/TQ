public class Automobile {
    static void displayEngine(Car cars[], String engine) {
        System.out.println(engine);
        for (int i = 0; i < cars.length; i++) {
            if (cars[i].getEngine().getName().equals(engine)) {
                System.out.println(cars[i]);
            }
        }
    }

    public static void main(String[] args) {
        Engine engines1[] = new Engine[4];
        engines1[0] = new Engine(101, "PETROL");
        engines1[1] = new Engine(102, "DIESEL");
        engines1[2] = new Engine(102, "REVTRON");
        engines1[3] = new Engine(102, "ICE");

        Car cars[] = new Car[4];
        cars[0] = new Car(1, "TATA-PUNCH", engines1[0]);
        cars[1] = new Car(2, "TATA-ALTOZ", engines1[2]);
        cars[2] = new Car(3, "TATA-TIAGO", engines1[3]);
        cars[3] = new Car(4, "TATA-TIGOR", engines1[0]);

        displayEngine(cars, "PETROL");

    }
}
