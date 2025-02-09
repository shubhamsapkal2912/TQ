public class Course {
private int cid;
private String name;

Course(){
    
}
 Course(int cid, String name) {
    this.cid = cid;
    this.name = name;
}
public int getCid() {
    return cid;
}
public void setCid(int cid) {
    this.cid = cid;
}
public String getName() {
    return name;
}
public void setName(String name) {
    this.name = name;
}

public String toString(){
    return "ID: "+cid+",Name: "+name;
}


}