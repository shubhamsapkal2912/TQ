package constructor;

public class PersonTest {
    public static void main(String[] args) {
        Person p1=new Person();
        //System.out.println(p1);
        //System.out.println(p1.toString());

        Person p2=new Person(1,"Shubham",22);//early initialization not: getter setter lazy initialization
        System.out.println(p2.toString());
    }
}
