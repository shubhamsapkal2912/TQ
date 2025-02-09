public class Car {
    private int cid;
    private String name;
    private Engine engine;
    public Car(int cid, String name, Engine engine) {
        this.cid = cid;
        this.name = name;
        this.engine = engine;
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
    public Engine getEngine() {
        return engine;
    }
    public void setEngine(Engine engine) {
        this.engine = engine;
    }
    @Override
    public String toString() {
        return "Car [cid=" + cid + ", name=" + name + ", engine=" + engine + "]";
    }
    
}
