class Parent{
    int id;
    String name;
    Parent(){

    }
    Parent(int id,String name){
      this.id=id;
      this.name=name;  
    }
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setId(int id){
        this.id=id;
    }

    public String toString(){
        return "Parent [ID:"+id+",Name: "+name+"]";
    }
    
}

class Child extends Parent{
    double salary;
    Child(){

    }
    Child(int id,String name,double salary){
        super(id,name);
        this.salary=salary;
    }

    public double getSalary(){
        return salary;
    }
    public void setSalary(double salary){
        this.salary=salary;
    }
    public String toString(){
        return super.toString()+"Child:"+salary;
    }
}
public class Test {
    public static void main(String[] args) {
        Child c1=new Child(1,"Shubham", 90000);
        System.out.println(c1);
        
    }
}
