public class GroceryShop {

    static void findSupplier(Supplier []suppliers,String item){
        System.out.println(item);
        for(Supplier x:suppliers){

            for(Item i:x.getItems()){
                if(i.getIname().equals(item)){
                    System.out.println(x.getSid()+" "+x.getName()+" "+x.getMobileNo());
                }
            }
        }
    }
    public static void main(String[] args) {
        Supplier supplier[]=new Supplier[3];
        
        Item i1[]=new Item[3];
        i1[0]=new Item(101, "Chocolate", 99);
        i1[1]=new Item(102, "Chips", 85);
        i1[2]=new Item(103, "Biscuits", 50);

        supplier[0]=new Supplier(1, "Shubham",9373290652l, i1);

        Item i2[]=new Item[2];
        i2[0]=new Item(201,"Brush",20);
        i2[1]=new Item(202,"Soap",28);

        supplier[1]=new Supplier(2, "Ronit", 8888329645l, i2);
        
        Item i3[]=new Item[1];
        i3[0]=new Item(301, "Chocolate", 99);
        supplier[2]=new Supplier(3, "Abhi", 88883272645l, i3);


System.out.println("--------------------------------------------------");
for(Supplier x:supplier){
    System.out.println(x.getSid()+" "+x.getName()+" "+x.getMobileNo());
    for(Item i:x.getItems()){
        System.out.println(i);
    }
    System.out.println("--------------------------------------------------");
}

findSupplier(supplier, "Chocolate");


    }
}
