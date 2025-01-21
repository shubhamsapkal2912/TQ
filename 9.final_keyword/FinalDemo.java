class Course {
    int id;
    String name;
    final double fees;

    Course() {
        this.fees = 0.0;
    }

    Course(int id, String name, double fees) {
        this.id = id;
        this.name = name;
        this.fees = fees;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
    public double getFees(){
        return fees;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
    final void requiredSkills(){
        System.out.println("Computer Knowdledge");
        System.out.println("Consistency");
    }

public String toString(){
    return "Course[ID:"+id+" Name:"+name+" Fees:"+fees+"]";
}
}






    class FullStack extends Course {
        /*final void requiredSkills(){
        Cannot override the final method from Course
        }*/
    }


public class FinalDemo {
    
    public static void main(String[] args) {
        Course c1=new Course(1, "JAVA", 58000);
        System.out.println(c1.toString());
        Course c2=new Course(2, "KNIME", 57000);
        System.out.println(c2.toString());

    }
}
