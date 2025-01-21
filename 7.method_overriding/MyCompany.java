//package com.overriding;

class Employee
{
	private int id;
	private String name;
	protected double salary;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public void calculateSalary()
	{
		System.out.println("Monthly salary:"+salary);
		System.out.println("Annual salary:"+(salary*12));
	}
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

	
}

class PartTimeEmployee extends Employee
{
	private int workingHours;

	public PartTimeEmployee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PartTimeEmployee(int id, String name, double salary, int workingHours) {
		super(id, name, salary);
		this.workingHours=workingHours;
		// TODO Auto-generated constructor stub
	}

	public int getWorkingHours() {
		return workingHours;
	}

	public void setWorkingHours(int workingHours) {
		this.workingHours = workingHours;
	}

	@Override
	public String toString() {
		return "PartTimeEmployee [workingHours=" + workingHours + ", Id=" + getId() + ", Name=" + getName()
				+ ", Salary=" + getSalary() + "]";
	}
	
	public void calculateSalary()
	{
		System.out.println("Salary per hour:"+salary);
		System.out.println("Daily Salary:"+salary*workingHours);
	}
  

}

public class MyCompany {

	
	public static void main(String[] args) {
		
		Employee e1= new Employee(101, "Ruben", 30000);
		System.out.println(e1);
		e1.calculateSalary();
		
		System.out.println("----------------------");
		
		PartTimeEmployee e2= new PartTimeEmployee(102, "Swati",500,4);
		System.out.println(e2);
		e2.calculateSalary();
		
	}
}
