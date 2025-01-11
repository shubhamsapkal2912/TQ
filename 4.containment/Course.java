package com.containment;

public class Course {
	
	private int id;
	private String cname;
	private float fees;
	
	public Course(){
		
	}
	
	public Course(int id, String cname, float fees)
	{
		this.id=id;
		this.cname=cname;
		this.fees=fees;
	}
	
	public void setId(int id)
	{
		this.id=id;
	}
	
	public int getId()
	{
		return id;
		
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public float getFees() {
		return fees;
	}

	public void setFees(float fees) {
		this.fees = fees;
	}
	
	public String toString()
	{
		return "Course:"+id+", "+cname+" ,"+fees;
	}
	
	
	

}
