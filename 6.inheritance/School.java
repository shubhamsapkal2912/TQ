class Student{
private int id;
private String name;
private double fees;
Student(){

}
Student(int id ,String name,double fees){
this.id=id;
this.name=name;
this.fees=fees;
}
public int getId() {
    return id;
}
public void setId(int id) {
    this.id = id;
}
public String getName() {
    return name;
}
public void setName(String name) {
    this.name = name;
}
public double getFees() {
    return fees;
}
public void setFees(double fees) {
    this.fees = fees;
}

public String toString(){
    return "Id:"+id+" Name: "+name+" Fees: "+fees;
}

}

class DanceStudent extends Student{
private String danceType;
DanceStudent(){
    super();
}
DanceStudent(int id ,String name,double fees,String danceType){
super(id,name,fees);
this.danceType=danceType;
}
public String getDanceType() {
    return danceType;
}
public void setDanceType(String danceType) {
    this.danceType = danceType;
}

public String toString(){
    return super.toString()+" Dance Type: "+danceType;
}

}
public class School {
    public static void main(String[] args) {
        DanceStudent s1= new DanceStudent(1, "Shubham", 10000, "Salsa");
        System.out.println(s1);
       // System.out.println(s1.toString());
    }
    
}
