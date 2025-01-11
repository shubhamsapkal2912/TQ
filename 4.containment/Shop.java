public class Shop {
    public static void main(String[] args) {
        Supplier s1=new Supplier(1, "Shubham");
        Supplier s2=new Supplier(2, "Abhishek");
        Supplier s3=new Supplier(3, "Ronit");

        Item i1=new Item(101, "Soap", 99,"High Quality bathing soap", s1);
        Item i2=new Item(102, "Shampo", 45,"High Quality bathing shampo", s3);
        
        System.out.println(i1);
        System.out.println(i2);
        
        Item i3=new Item(103, "Toothpaste", 45,"High Quality toothpaste", new Supplier(104, "Aditya"));
        System.out.println(i3);
        
        Item i4=new Item();
        i4.setName("Stationary");
        i4.setDescription("high quality");
        i4.setId(104);
        i4.setPrice(55);
        i4.setSupplier(new Supplier(105, "Ronit"));
        System.out.println(i4);

        Item i5=new Item();
        i5.setName("Vegetables");
        i5.setDescription("high quality vegetable");
        i5.setId(104);
        i5.setPrice(90);
        i5.setSupplier(new Supplier());
        i5.getSupplier().setId(105);
        i5.getSupplier().setName("Aduli");

        System.out.println(i5);


    }
}
