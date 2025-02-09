import java.util.Scanner;

public class GroceryShop {
    static Scanner sc = new Scanner(System.in);

    static void enterDetails(Product p) {
        System.out.println("Enter ID :");
        p.setProductId(sc.nextInt());
        System.out.println("Enter Name :");
        p.setName(sc.next());
        System.out.println("Enter Price :");
        p.setPrice(sc.nextFloat());
    }

    static void comparePrice(Product p[]) {
        for(int i=0;i<p.length;i++){
            for(int j=i+1;j<p.length;j++){

                if(p[i].getPrice()==p[j].getPrice()){
                    // if(i>j)
                    //     continue;
                    System.out.println(p[i]);
                    System.out.println(p[j]);
                }
            }
        }
    }

    static float maxPrice(Product p[]) {
        float maxPrice = Float.MIN_VALUE;
        for (Product x : p) {
            if ( x.getPrice()>maxPrice) {
                maxPrice = x.getPrice();
            }
        }
        return maxPrice;
    }

    public static void main(String[] args) {
        Product p[] = new Product[2];

        for (int i = 0; i < p.length; i++) {
            p[i] = new Product();
            enterDetails(p[i]);
        }
        for (int i = 0; i < p.length; i++) {
            System.out.println(p[i]);
        }

        float maxPrice = maxPrice(p);
        for (Product x : p) {
            if (x.getPrice() == maxPrice) {
                System.out.println(x);
            }
        }
    }
}
