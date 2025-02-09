public class Course {
    private int cid;
    private String cname;


    Course(){
        super();
    }
    Course(int cid, String cname) {
        super();
        this.cid = cid;
        this.cname = cname;
    }

    public int getCid() {
        return cid;
    }
    public void setCid(int cid) {
        this.cid = cid;
    }
    public String getCname() {
        return cname;
    }
    public void setCname(String cname) {
        this.cname = cname;
    }

    public String toString(){
        return "CID: "+cid+" ,Name: "+cname;
    }
     
   

}
