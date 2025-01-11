package constructor.assignment;

public class Product2 {
    private int prod_id;
    private String prod_name;
    private String description;
    private double price;
    private int quantity;
    private double discount;

    private double total_price;
    private double discount_price;

    Product2(int prod_id, String prod_name, String description, double price, int quantity, double discount) {
        this.prod_id = prod_id;
        this.prod_name = prod_name;
        this.description = description;
        this.price = price;
        this.quantity = quantity;
        this.discount = discount;
    }

    public String toString() {
        return "Name: " + prod_name + " ID: " + prod_id + " Description: " + description + " Price: " + price
                + " Quantity: " + quantity + " Discount: " + discount;
    }
    public void displayProduct(){
        System.out.println("Name: "+prod_name);
        System.out.println("ID: "+prod_id);
        System.out.println("Price: "+price);
        System.out.println("Description: "+description);
        System.out.println("Quantity: "+quantity);
        System.out.println("Discount: "+discount+"%");
    }
    public void totalPrice(){
        total_price=price*quantity;
        System.out.println("Total Price: "+total_price);
    }
    public void discountPrice(){
        discount_price=total_price-(discount/100*total_price);
        System.out.println("Discount Price: "+discount_price);
    }


    public static void main(String[] args) {
Product2 p2=new Product2(101, "Chocolate", "Rich chocolate", 100, 5, 10);
System.out.println(p2);
p2.displayProduct();
p2.totalPrice();
p2.discountPrice();

    }
}
