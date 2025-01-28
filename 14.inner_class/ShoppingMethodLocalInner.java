class Mall {
    private String mallName = "Phoenix";
    private String location = "Pune";

    void doShopping() {
        class Cart {
            String item;
            float price;
            static double bill = 0;
            public void addItem(String item,float price){
                this.item=item;
                this.price=price;
                System.out.println(this.item+ " "+this.price);
                bill+=price;
            }
            public void displayBill(){
                System.out.println("---------------------");
                System.out.println("Total Bill: "+bill);

                System.out.println("======================");
                System.out.println("Thanks for shopping at : "+mallName+" "+location);
            }
        }
        Cart c1=new Cart();
        c1.addItem("Laptop", 86000);
        c1.addItem("Pendrive", 500);
        c1.addItem("Mobile", 20000);
        c1.displayBill();
    }
}

public class ShoppingMethodLocalInner {
    public static void main(String[] args) {
        Mall m1=new Mall();
        m1.doShopping();
    }
}
