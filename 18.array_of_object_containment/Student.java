import java.util.Arrays;

public class Student {
   private int sid;
   private String name;
   private double marks[];
   private double percentage;
   Course course;
   Student(){

   }
 Student(int sid, String name, double []marks, Course course) {
    this.sid = sid;
    this.name = name;
    this.marks = marks;
    this.course = course;
    setPercentage();
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
public double[] getMarks() {
    return marks;
}
public void setMarks(double []marks) {
    this.marks = marks;
    setPercentage();
}
public Course getCourse() {
    return course;
}
public void setCourse(Course course) {
    this.course = course;
}

public double getPercentage() {
    return percentage;
}
public void setPercentage() {
    double total_marks=0;
    for(int i=0;i<marks.length;i++){
total_marks+=marks[i];
    }
    percentage=total_marks/marks.length;
}

   
public String toString(){
    return "ID: "+sid+", Name: "+name+", Marks: "+Arrays.toString(marks)+", Course: "+course;
}

}
