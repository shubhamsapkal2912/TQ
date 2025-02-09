public class Student2 {
    private int sid;
    private String sname;
    private double percentage;
    private Course course;

    Student2() {
        super();
    }

    Student2(int sid, String sname, double percentage, Course course) {
        super();
        this.sid = sid;
        this.sname = sname;
        this.percentage = percentage;
        this.course = course;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public void setPercentage(double percentage) {
        this.percentage = percentage;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public int getSid() {
        return sid;
    }

    public String getSname() {
        return sname;
    }

    public double getPercentage() {
        return percentage;
    }

    public Course getCourse() {
        return course;
    }

    public String toString(){
        return "ID "+sid+" ,Name: "+sname+" ,Percentage "+percentage+" ,Course: "+getCourse()+" ";
    }

}
