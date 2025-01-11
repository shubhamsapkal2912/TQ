public class Company {
    private String name;
    private String country;

    public Company(){

    }
    public Company(String name,String country){
        this.name=name;
        this.country=country;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setCountry(String country) {
        this.country = country;
    }
    public String getName() {
        return name;
    }
    public String getCountry() {
        return country;
    }
    public String toString(){
        return "Name: "+name+" Country: "+country;
    }
    public static void main(String[] args) {
        
    }
}
