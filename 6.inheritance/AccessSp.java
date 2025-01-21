public class AccessSp{
    private int a;
    int b;
    protected int c;
    public int d;

    private void show(){
        System.out.println("Private Method");
    }
    void display(){
        System.out.println("Default Method");
    }
    public void printMe(){
        System.out.println("Public Method");
    }
    protected void display1(){
        System.out.println("Protected Method");
    }


    public static void main(String[] args) {
        AccessSp obj=new AccessSp();
        obj.a=10;
        obj.b=20;
        obj.c=30;
        obj.d=40;
        System.out.println(obj.a);

        obj.show();
        obj.display();
        obj.printMe();
        obj.display1();
        
    }
}
