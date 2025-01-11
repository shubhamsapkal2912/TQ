//package com.staticdemo;

public class StaticBlockDemo {
	
	private String color="blue";
	//private static String scolor="Red";
	private static String scolor;
	
	// iib: instance iniatilzer block
	// sib : static block
	
	static
	{
		System.out.println("I am in static block");
		//m1();
	}
	
	static
	{		
		System.out.println(scolor);
		scolor="Yellow";
	}
	
	
	// static block are automatically called after compilation
	// run in sequence
	// methods have to be called
	static void m1()
	{
		scolor="Blue";
	}
	
	public static void main(String[] args) {
		
		System.out.println(scolor);
		//System.out.println(color);
		
	}

}
