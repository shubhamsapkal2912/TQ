package constructor;

public class Person {
    private int age;
    private int id;
    private String name;
    Person(){
        name="Unknown";
    }
    public Person(int id,String name,int age){
this.id=id;
this.name=name;
this.age=age;
    }
    public String toString(){
return "Person(ID :"+id+",Name :"+name+",Age :"+age+")";
    }
}
