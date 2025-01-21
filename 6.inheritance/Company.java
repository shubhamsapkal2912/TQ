class Employee {
    private int id;
    private String name;
    private double salary;

    Employee() {
        System.out.println("I am in Employee constructor");
    }

    Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public String toString() {
        return "Id: " + id + " Name: " + name + " Salary: " + salary;
    }

    public void workingHours() {
        System.out.println("8 hours:");
    }
}

class Manager extends Employee {
    private double bonus;

    public Manager() {
        super();
        System.out.println("I am in Manager Constructor:");
    }

    public Manager(int id, String name, double salary, double bonus) {
        super(id, name, salary);
        this.bonus = bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public String toString() {
        // return super.toString()+",bonus: "+bonus;
        return "Manager[id:" + getId() + ",Name:" + getName() + ",Salary:" + getSalary() + ",Bonus:" + getBonus() + "]";
    }

}

class HRManager extends Manager {
    private int noOfAct;
    private double appr;

    HRManager() {

    }

    HRManager(int id, String name, double salary, double bonus, int noOfAct, double appr) {
        super(id, name, salary, bonus);
        this.noOfAct = noOfAct;
        this.appr = appr;
    }

    public int getNoOfAct() {
        return noOfAct;
    }

    public void setNoOfAct(int noOfAct) {
        this.noOfAct = noOfAct;
    }

    public double getAppr() {
        return appr;
    }

    public void setAppr(double appr) {
        this.appr = appr;
    }

    public String toString() {
        return super.toString() + " NoOfAct:" + noOfAct + " Appreciation: " + appr;
    }
}

class Programmer extends Employee {
    private String skillSet;

    Programmer() {

    }

    Programmer(int id, String name, double salary, String skillSet) {
        super(id, name, salary);
        this.skillSet = skillSet;
    }
    public String getSkillSet(){
        return skillSet;
    }
    public void setSkillSet(String skillSet){
        this.skillSet=skillSet;
    }
    public String toString(){
        return "Programmer [ Id:"+getId()+",Name: "+getName()+",Salary:"+getSalary()+",Skillset:"+skillSet;
    }
}

public class Company {

    public static void main(String[] args) {
        // Manager m1=new Manager();
        // System.out.println(m1);

        // Manager m3=new Manager();
        // Manager m2=new Manager(1,"Shubham",90000,10000);
        // System.out.println(m2);
        // m2.workingHours();

       // HRManager hm1 = new HRManager(1, "Shubham", 90000, 9000, 10, 5000);
        //System.out.println(hm1);

        Programmer p1=new Programmer(1, "Shubham", 90000, "Problem-Solving");
        System.out.println(p1);
    }
}