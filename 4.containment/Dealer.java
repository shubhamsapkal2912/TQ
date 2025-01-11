public class Dealer {
    public static void main(String[] args) {
        
        Company c1=new Company("TATA","India");
        Company c2=new Company("TOYOTA","Japan");
        Company c3=new Company("VW","Germany");

        Car car1=new Car("Altroz","XMs",799999,c1);
        Car car2=new Car("Hilux","V12",4599999,c2);
        Car car3=new Car("Virtus","X",1299999,c3);
        Car car4=new Car("Punch","Pure+Rhythm",699999,c1);

        Car car5=new Car("XUV700","AX7L",3299999,new Company("Mahindra","India"));
System.out.println(car1);
System.out.println(car2);
System.out.println(car3);
System.out.println(car4);
System.out.println(car5);
    }
}
