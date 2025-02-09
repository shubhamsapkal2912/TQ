public class Student {

    private int sid;
    private String name;
    private float marks;

    Student() {
        super();
    }

    Student(int sid, String name, float marks) {
        this.sid = sid;
        this.name = name;
        this.marks = marks;
    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getMarks() {
        return marks;
    }

    public void setMarks(float marks) {
        this.marks = marks;
    }

    public String toString() {
        return "ID: " + sid + " Name: " + name + " Marks: " + marks;
    }

}