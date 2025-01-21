class Student{
    private int id;
    private String name;
    Student(){
        super();
    }
    Student(int id,String name){
        super();
        this.id=id;
        this.name=name;
    }
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public void setId(int id){
        this.id=id;
    }
    public void setName(String name){
        this.name=name;
    }
    public String toString(){
        return "Student[ID:"+id+" Name:"+name+"]";
    }
    protected void finalize() throws Throwable{
        System.out.println("In finalize");
        super.finalize();//The method finalize() from the type Object
                        // has been deprecated since version 9 and 
                        //marked for removal
        
    }
}
public class FinalizeDemo {
    public static void main(String[] args) {
        Student s1=new Student(1, "shubham");
        System.out.println(s1);
        s1=null;
        System.out.println(s1);
        System.gc();
       Runtime.getRuntime().gc();
        
    }
}
