import java.util.*;

public class ShopUserInput {

    static Scanner sobj = new Scanner(System.in);

    public void enterItemDetail(Item i){
        System.out.println("Enter item id");
        i.setId(sobj.nextInt());
        System.out.println("Enter item name");
        i.setName(sobj.next());
        System.out.println("Enter item price");
        i.setPrice(sobj.nextDouble());
        System.out.println("Enter item description");
        i.setDescription(sobj.next());

        i.setSupplier(new Supplier());

        System.out.println("Enter supplier id");
        i.getSupplier().setId(sobj.nextInt());;
        System.out.println("Enter supplier name");
        i.getSupplier().setName(sobj.next());
    }

    public static void main(String[] args) {
        ShopUserInput s1=new ShopUserInput();

        Item i1=new Item();
        s1.enterItemDetail(i1);
        System.out.println(i1);
    }
}
