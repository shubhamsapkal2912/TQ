package constructor;

public class GroceryStore {
    static void giveDiscount(Item i){
        if(i.getPrice()>100){
            double p=i.getPrice();
            p=p-(0.05*p);
            i.setPrice(p);
        }
    }
    public static void main(String[] args) {
        // Item I1=new Item(1,"Chips",220);
        // Item I2=new Item();
        // I2.setId(101);
        // I2.setName("Kurkure");
        // I2.setPrice(33);
        // giveDiscount(I1);
        // giveDiscount(I2);
        // System.out.println(I1);
        // System.out.println(I2);

        Item I3=new Item(3,"Chocolate",330);
        System.out.println(I3);
        I3.giveDiscount();
        System.out.println(I3);
        
    }


}
