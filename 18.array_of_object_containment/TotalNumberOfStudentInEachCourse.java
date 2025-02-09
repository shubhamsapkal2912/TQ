public class TotalNumberOfStudentInEachCourse {


    public static void countStudentCourseWise(Student student[], Course course[]) {
        int count;
        for (Course c : course) {
            count = 0;
            for (Student s : student) {
                if (s.getCourse().equals(c)) {
                    count++;
                }
            }
            System.out.println(c + "-->" + count);
            //System.out.println(c.getName() + "-->" + count);
        }
    }

    public static void main(String[] args) {
        Course course[] = new Course[3];
        course[0] = new Course(1, "JAVA");
        course[1] = new Course(2, "QA");
        course[2] = new Course(3, "GEN-AI");

        Student student[] = new Student[4];

        student[0] = new Student(1, "Shubham", new double[] { 90, 87, 43 }, course[0]);
        student[1] = new Student(2, "Ronit", new double[] { 94, 82, 39 }, course[1]);
        student[2] = new Student(3, "Abhi", new double[] { 85, 90, 49 }, course[2]);
        student[3] = new Student(4, "Aditya", new double[] { 99, 35, 43 }, course[0]);

        countStudentCourseWise(student, course);

    }
}
