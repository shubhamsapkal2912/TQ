package com.containment;

public class College1 {

   public static void main(String[] args) {
	
	  Course c1 = new Course();
	  c1.setId(1);
	  c1.setCname("Full Stack");
	  c1.setFees(89000);
	  
	  Student s1=new Student();
	  s1.setSid(101);
	  s1.setSname("Pranali");
	  s1.setMarks(90);
	  s1.setCourse(c1);
	  
	  System.out.println(s1);
	  
	  // anonymous
	  
	  Student s2= new Student();
	  s2.setSid(102);
	  s2.setSname("Mohan");
	  s2.setMarks(99);
	  s2.setCourse(new Course());
	  s2.getCourse().setId(2);
	  s2.getCourse().setCname("AI");
	  s2.getCourse().setFees(99000);
	  
	  System.out.println(s2);
	  
	  
	  
	  
	   
}
   
}
