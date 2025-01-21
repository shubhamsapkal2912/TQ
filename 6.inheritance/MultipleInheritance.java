class Person{
int id;
String name;
Person(){

}
Person(int id,String name){
this.id=id;
this.name=name;
}
public int getId(){
    return id;
}
public String getName(){
    return name;
}
public void setId(int id){
    this.id=id;
}
public void setName(String name){
    this.name=name;
}

public String toString(){
    return "Person[ID:"+id+", Name:"+name+" ]";
}

}


class Employee1{
    int id;
    double salary;
    Employee1(){

    }
    Employee1(int id,double salary){
        this.id=id;
        this.salary=salary;
    }
    public int getId(){
        return id;
    }
    public double getSalary(){
        return salary;
    }
    public void setId(int id){
        this.id=id;
    }
    public void setSalary(){
        this.salary=salary;
    }
    public String toString(){
        return "Employee[ Id:"+id+", Salary:"+salary+" ]";
    }
}

// class TechProgrammer extends Employee1,Person{
    //Ambiguity ERROR:---------
// }

public class MultipleInheritance {
    
}
