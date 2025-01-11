package com.containment;

import java.util.Scanner;

public class CollegeUserInput {
	
	static Scanner sc= new Scanner(System.in);
	
	public void enterStudentDetails(Student s)
	{
		System.out.println("Enter student id:");
		s.setSid(sc.nextInt());
		
		System.out.println("Enter student name:");
		s.setSname(sc.next());
		
		System.out.println("Enter marks:");
		s.setMarks(sc.nextFloat());
		
		// course
		
		s.setCourse(new Course());
		
		System.out.println("Enter course id:");
		s.getCourse().setId(sc.nextInt());
		
		System.out.println("Enter course name:");
		s.getCourse().setCname(sc.next());
		
		System.out.println("Enter course fees:");
		s.getCourse().setFees(sc.nextFloat());
		
	
	}

   public static void main(String[] args) {
	
     CollegeUserInput obj= new CollegeUserInput();
     Student s1= new Student();
     Student s2= new Student();
     obj.enterStudentDetails(s1);
     obj.enterStudentDetails(s2);
     
     System.out.println(s1);
     System.out.println(s2);
	  
	   
}
   
}
