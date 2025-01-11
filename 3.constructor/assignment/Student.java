package constructor.assignment;

public class Student {
    int roll_no;
    String name;
    double sub1;
    double sub2;
    double sub3;
    double sub4;
    double sub5;
    double total;
    double percentage;
    double grade;
    Student(){

    }
    Student(int roll_no,String name,double sub1,double sub2,double sub3,double sub4,double sub5){
this.roll_no=roll_no;
this.name=name;
this.sub1=sub1;
this.sub2=sub2;
this.sub3=sub3;
this.sub4=sub4;
this.sub5=sub5;
    }
    public void displayStudent(){
        System.out.println("Name: "+name);
        System.out.println("Roll no: "+roll_no);
        System.out.println("Sub1: "+sub1);
        System.out.println("Sub2: "+sub2);
        System.out.println("Sub3: "+sub3);
        System.out.println("Sub4: "+sub4);
        System.out.println("Sub5: "+sub5);
    }
    public double calculatePercentage(){
        total=sub1+sub2+sub3+sub4+sub5;
        return total/5;
    }
    public void calculateGrade(){
        if(total>450){
            System.out.println("A+");
        }
        else if(total>400&&total<450){
            System.out.println("A");
        }
        else{
            System.out.println("B");
        }
    }
    public static void main(String[] args) {
        Student s1=new Student(1, "Shubham", 80, 90, 70, 75, 90);
        s1.displayStudent();
        s1.calculatePercentage();
        s1.calculateGrade();
    }
}
