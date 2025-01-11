public class Dealer1 {
    public static void main(String[] args) {
        Company c1=new Company();
        c1.setCountry("INDIA");
        c1.setName("TATA");

        Car car1=new Car();
        car1.setName("Harrier");
        car1.setModel("BLACKXZ");
        car1.getPrice(16999.99);
        car1.setCompany(c1);
        System.out.println(car1);
        
        Car car2=new Car();
        car2.setName("XM");
        car2.setModel("TOP");
        car2.setPrice(32999.99);
        car2.setCompany(new Company());
        car2.getCompany().setCountry("INDIA");
        car2.getCompany().setCompany("BMW");
        System.out.println(car2);
    }
}
