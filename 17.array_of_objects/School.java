public class School {

    static void sortStudent(Student st[]) {
        Student s = new Student();
        for (int i = 0; i < st.length; i++) {
            for (int j = i + 1; j < st.length; j++) {
                if (st[i].getMarks() > st[j].getMarks()) {
                    s = st[i];
                    st[i] = st[j];
                    st[j] = s;
                }
            }
        }
    }

    static void maxMarks(Student st[]) {
        Student top = new Student();
        top = st[0];
        for (int i = 0; i < st.length; i++) {
            if (st[i].getMarks() > top.getMarks()) {
                top = st[i];
            }
        }
        System.out.println(top);
    }

   /*  static void findTopper(Student st[]) {
        float maxMarks=Float.MIN_VALUE;
        Student stud = new Student();
        for(Student s:st){
            if(s.getMarks()>maxMarks){
                maxMarks=s.getMarks();
                stud=s;
            }
        }
        System.out.println(stud);
    }
        */

        static float findTopper(Student st[]) {
            float maxMarks=Float.MIN_VALUE;

            for(Student s:st){
                if(s.getMarks()>maxMarks){
                    maxMarks=s.getMarks();
                }
            }
return maxMarks;
        }

    public static void main(String[] args) {
        // Student s=new Student();
        // System.out.println(s);

        Student st[] = new Student[5];
        // System.out.println(st[0]); -->> return -->>null

        st[0] = new Student(1, "shubham", 95);
        st[1] = new Student(2, "ronit", 95);
        st[2] = new Student(3, "abhishek", 80);
        st[3] = new Student(4, "aditya", 70);
        st[4] = new Student(5, "abhinandan", 92);
        // st[5]=new Student(6, "saurabh", 91);

        for (Student student : st) {
            System.out.println(student);
        }
        System.out.println("------------------");
        // for (int i = 0; i < st.length; i++) {
        // System.out.println(st[i]);
        // }
        sortStudent(st);
        for (int i = 0; i < st.length; i++) {
            System.out.println(st[i]);
        }
        System.out.println("-----------");
        //maxMarks(st);
        // System.out.println("-----------");
        // findTopper(st);
        // Sort student on the basis of marks

        float maxMarks=findTopper(st);
        for(Student s:st){
            if(s.getMarks()==maxMarks){
                System.out.println(s);
            }
        }

    }
}
