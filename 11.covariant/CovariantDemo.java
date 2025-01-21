class Person{
int id;
String name;
Person(){

}
Person(int id,String name){
this.id=id;
this.name=name;
}

public Person getInstance(){
return new Person(1,"ShubZ");
}
public String toString(){
    return "Person[ID:"+id+" Name:"+name+"]";
}

}
class Student extends Person{
int marks;
Student(){

}
Student(int id,String name,int marks){
super(id,name);
this.marks=marks;
}

public Student getInstance(){
    return new Student(1, "Rohan", 99);
}
public String toString(){
    return super.toString()+ "Marks:"+marks;
}

}


public class CovariantDemo {
    public static void main(String[] args) {
        Student s1=new Student(1,"Shubham",99);
        Person p1=new Person(2,"Rohan");
        Student s2;
        s2=s1.getInstance();
        System.err.println(s1);
        System.err.println(p1);
    }
}
