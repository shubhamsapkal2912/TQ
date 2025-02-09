public class Item {
    private int id;
    private String iname;
    private double cost;

    Item() {

    }

    Item(int id, String iname, double cost) {
        this.id = id;
        this.iname = iname;
        this.cost = cost;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIname() {
        return iname;
    }

    public void setIname(String iname) {
        this.iname = iname;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public String toString(){
        return "ID: "+id+" , Name: "+iname+" , Price: "+cost;
    }

}