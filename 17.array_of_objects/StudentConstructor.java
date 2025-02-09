public class StudentConstructor {
    public static void main(String[] args) {
        Course c1=new Course(101, "FullStack");
        Course c2=new Course(102, "GenAI");

        Student2 st[]=new Student2[4];
        st[0]=new Student2(1, "Shubham", 90, c1);
        st[1]=new Student2(2, "Ronit", 89, c2);
        st[2]=new Student2(3, "Abhi", 93, c1);

        st[3]=new Student2();
        st[3].setSid(4);
        st[3].setSname("Aditya");
        st[3].setPercentage(70);
        st[3].setCourse(c2);

        for(Student2 s:st){
            System.out.println(s);
        }
    }
}
