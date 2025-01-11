package com.containment;

public class College {

   public static void main(String[] args) {
	
	   Course c1= new Course(1,"Java",32000);
	   Course c2= new Course(2,".net",34000);
	   Course c3= new Course(3,"Python",40000);
	   
	   Student s1= new Student(101,"Swati",90,c1);
	   Student s2= new Student(102,"Ram",81,c1);
	   Student s3= new Student(103,"Salman",85,c2);
	   Student s4= new Student(104,"Kritika",78,c3);
	   
	   // anonymous object
	   
	   Student s5 = new Student(105,"Mayuri",99,new Course(4,"AI",56000));
	   
	   // course name: GenAI
	 s5.getCourse().setCname("GenAI");
	   
	   // Course c= s5.getCourse();
	   // c.setCname("GenAI");
	   
	   System.out.println(s1);
	   System.out.println(s2);
	   System.out.println(s3);
	   System.out.println(s4);
	   System.out.println(s5);
	   
	   c1.setCname("CoreJava");
	   
	   System.out.println(s1);
	   System.out.println(s2);
	   
	   
}
   
}
