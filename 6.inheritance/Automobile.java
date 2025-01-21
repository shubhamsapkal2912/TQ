class Vehicle {
    private int manufactureYear;
    private String model_no;

    Vehicle() {

    }

    Vehicle(int manufactureYear, String model_no) {
        this.manufactureYear = manufactureYear;
        this.model_no = model_no;
    }

    public int getId() {
        return manufactureYear;
    }

    public void setId(int manufactureYear) {
        this.manufactureYear = manufactureYear;
    }

    public String getModel_no() {
        return model_no;
    }

    public void setModel_no(String model_no) {
        this.model_no = model_no;
    }

    public String toString() {
        return "id: " + manufactureYear + " Model_No: " + model_no;
    }

}

class Car extends Vehicle {
    private String type;
    private double price;
    private int carNo;

    Car() {
        super();
    }

    Car(int manufactureYear, String model_no, String type,double price,int carNo) {
        super(manufactureYear, model_no);
        this.type = type;
        this.price=price;
        this.carNo=carNo;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String toString() {
        return super.toString() + " Type: " + type+" Price: "+price+"CarNO: "+carNo;
    }

}

public class Automobile {
    public static void main(String[] args) {
       // Car c1 = new Car(101, "A30", "SUV");
        //System.out.println(c1);
    }
}
