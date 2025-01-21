public class Apple {
    int model_no;
    String name;
    final String color="Space Grey";
    Apple(){

    }
    Apple(int model_no,String name){
        this.model_no=model_no;
        this.name=name;
    }
    public String toString(){
        return "Apple[Model no:"+model_no+" Name:"+name+" Color:"+color;
    }
    public static void main(String[] args) {
        Apple a1=new Apple(1, "6S");
        System.out.println(a1);
    }
}
