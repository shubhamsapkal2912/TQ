public class Department {
    private int did;
    private String deptName;

    public Department() {

    }

    public Department(int did, String deptName) {
        this.did = did;
        this.deptName = deptName;
    }

    

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public String getDeptName() {
        return deptName;
    }

    public int getDid() {
        return did;
    }

    public void setDid(int did) {
        this.did = did;
    }
    public String toString(){
        return "Dept id: "+did+"Dept name: "+deptName;
    }

}
