class Parent{
public void display(int ...varArgs_int){
    for(int x: varArgs_int){
        System.out.println(x);
    }
}
}

class Child extends Parent{
    @Override
    public void display(int ...varArgs_int){
        for(int x: varArgs_int){
            System.out.println(x);
        }
    }
}
public class VarArgsOverriding {
    public static void main(String[] args) {
        Child c1=new Child();
        c1.display(1,2,3,4,5);
    }
}
