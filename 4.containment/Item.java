public class Item {

    private int id;
    private String name;
    private String description;
    private double price;
    private Supplier supplier;

    public Item(){

    }

    public Item(int id,String name,double price,String description,Supplier supplier){
        this.id=id;
        this.name=name;
        this.description=description;
        this.price=price;
        this.supplier=supplier;
    }
    public void setId(int id){
        this.id=id;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setDescription(String description){
        this.description=description;
    }
    public void setPrice(double price){
        this.price=price;
    }
    public void setSupplier(Supplier supplier){
        this.supplier=supplier;
    }

    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public String getDescription(){
        return description;
    }
    public double getPrice(){
        return price;
    }
    public Supplier getSupplier(){
        return supplier;
    }
    public String  toString(){
        return "Name:"+name+" Id: "+id+" Price: "+price+" Description: "+description+" Supplier "+supplier; 
    }
    public static void main(String[] args) {
        
    }
}