
import java.util.Arrays;

public class Supplier {
    private int sid;
    private String name;
    private long mobileNo;
    private Item items[];
    public Supplier(int sid, String name, long mobileNo, Item[] items) {
        this.sid = sid;
        this.name = name;
        this.mobileNo = mobileNo;
        this.items = items;
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
    public long getMobileNo() {
        return mobileNo;
    }
    public void setMobileNo(long mobileNo) {
        this.mobileNo = mobileNo;
    }
    public Item[] getItems() {
        return items;
    }
    public void setItems(Item[] items) {
        this.items = items;
    }

    public String toString(){
        return "ID: "+sid+" , Name: "+name+" , Mobile Number: "+mobileNo+" , Item= "+Arrays.toString(items);
    }
}
