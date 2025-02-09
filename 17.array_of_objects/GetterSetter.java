import java.util.Scanner;

public class GetterSetter {
  
    static Scanner sc=new Scanner(System.in);

    static void enterDetails(Student s){
        System.out.println("Enter ID :");
            s.setSid(sc.nextInt());
            System.out.println("Enter Name :");
            s.setName(sc.next());
            System.out.println("Enter Marks :");
            s.setMarks(sc.nextFloat());
    }
    public static void main(String[] args) {
        Student student[]=new Student[3];
        for(int i=0;i<student.length;i++){
            student[i]=new Student();//-->> if not created-->>null pointer exception
            enterDetails(student[i]);
            // System.out.println("Enter ID :");
            // student[i].setSid(sc.nextInt());
            // System.out.println("Enter Name :");
            // student[i].setName(sc.next());
            // System.out.println("Enter Marks :");
            // student[i].setMarks(sc.nextFloat());
        } 
        System.out.println("-------------------------------------");
        for(Student s:student){
            System.out.println(s);
        }
        sc.close();
    }
}
