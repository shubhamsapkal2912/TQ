import java.util.Scanner;

public class StudentUserInput {
    static Scanner sc = new Scanner(System.in);

    static void enterDetails(Student student) {
        System.out.println("Enter Student ID :");
        student.setSid(sc.nextInt());
        System.out.println("Enter Student Name :");
        student.setName(sc.next());

        System.out.println("Enter Marks  for 3 Subjects:");
        double marks[] = new double[3];
        for (int i = 0; i < 3; i++) {

            System.out.println("Enter Subject " + (i + 1) + " Marks");
            marks[i] = sc.nextDouble();
        }
        student.setMarks(marks);

        student.setCourse(new Course());
        System.out.println("Enter Course ID :");
        student.getCourse().setCid(sc.nextInt());
        System.out.println("Enter Course Name :");
        student.getCourse().setName(sc.next());
    }

    public static void main(String[] args) {
        Student student[] = new Student[3];
        for (int i = 0; i < 3; i++) {
            student[i] = new Student();
            enterDetails(student[i]);
        }

        for (Student x : student) {
            System.out.println(x);
        }

        student[0].getPercentage();
    }
}