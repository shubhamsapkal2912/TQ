
public class Car {
    private String name;
    private String model;
    private double price;
    private Company company;

    public Car(){

    }
    public Car(String name,String model,double price,Company company){
        this.name=name;
        this.model=model;
        this.price=price;
        this.company=company;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setModel(String model){
        this.model=model;
    }
    public void setPrice(double price){
        this.price=price;
    }
    public String getName(){
        return name;
    }
    public String getModel(){
        return model;
    }
    public double getPrice(){
        return price;
    }

    public void setCompany(Company company){
        this.company=company;
    }
    public Company getCompany(){
        return company;
    }
    public String toString(){
        return "Name: "+name+" Model: "+model+" Price: "+price+" Company: "+company;
    }
    public static void main(String[] args) {
        
    }
}
