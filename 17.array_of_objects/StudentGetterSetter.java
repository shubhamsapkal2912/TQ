import java.util.Scanner;

public class StudentGetterSetter {
    static Scanner sc=new Scanner(System.in);

    static void enterDetails(Student2 s){
        System.out.println("Enter ID");
        s.setSid(sc.nextInt());
        System.out.println("Enter Name ");
        s.setSname(sc.next());
        System.out.println("Enter Percentage");
        s.setPercentage(sc.nextFloat());

        s.setCourse(new Course());
        System.out.println("Enter Course ID: ");
        s.getCourse().setCid(sc.nextInt());
        System.out.println("Enter Course Name");
        s.getCourse().setCname(sc.next());
    }
 public static void main(String[] args) {
    Student2 student2[]=new Student2[3];
    for(int i=0;i<student2.length;i++){
        student2[i]=new Student2();
        enterDetails(student2[i]);
    }

    for(Student2 x:student2){
        System.out.println(x);
    }
 }   
}
