public class CollegeConstructor {
    public static void main(String[] args) {
        Student student[] = new Student[5];

        student[0] = new Student(1, "Shubham", new double[] { 90, 87, 43 }, new Course(101, "JAVA"));
        student[1] = new Student(2, "Ronit", new double[] { 94, 82, 39 }, new Course(102, "GEN-AI"));
        student[2] = new Student(3, "Abhi", new double[] { 85, 90, 49 }, new Course(103, "JAVA"));
        student[3] = new Student(4, "Aditya", new double[] { 99, 35, 43 }, new Course(105, "QA"));

        // double m1[]= {67.7,78.5};
        // double m2[]= new double[] {67.6,90.4};
        // NOTE : BOTH WAYS ARE CORRECT:

        student[4] = new Student();
        student[4].setSid(5);
        student[4].setName("Rohan");
        student[4].setMarks(new double[] { 87, 65, 45 });
        student[4].setCourse(new Course(106, "SPRING BOOT"));

        for (Student s : student) {
            System.out.println(s);
        }
        System.out.println("---------------------------------------------");
        student[0].getCourse().setName("HYBERNATE");
        for (Student s : student) {
            System.out.println(s);
        }

    }
}
