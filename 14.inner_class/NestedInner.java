

class Outer{
    private int num=10;
    class Inner{
        public void show(){
            System.out.println("Inner show");
        }
        public void display(){
            System.out.println("Num : "+num);//can access private data_member
        }
    }
}

public class NestedInner {

    public static void main(String[] args) {
        Outer o1=new Outer();
        Outer.Inner i1=o1.new Inner();
        i1.show();
        i1.display();

        Outer.Inner i2= new Outer().new Inner();
        //Outer.Inner i2= o1.new Inner();
        i2.show();
        i2.display();
    }
}