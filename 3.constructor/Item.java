package constructor;

public class Item {
    private int id;
    private String name;
    private double price;
    public Item(){

    }
    public Item(int id,String name,double price){
        this.id=id;
        this.name=name;
        this.price=price;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }
    void giveDiscount(){
        if(price>100){
            price=price-(0.05*price);
        }
    }
    public String toString(){
        return "Item(Id:"+id+" Name:"+name+" Price:"+price+")";
    }
    
}
