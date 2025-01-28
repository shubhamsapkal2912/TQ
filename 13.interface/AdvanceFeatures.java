//package com.interfacedemo;


interface Calculate
{
	void area();
	void perimeter();
	
	// Java 8
	/// mutable, backward compatability
	default void volume()
	{
		System.out.println("In volume method for 3d shapes");
		show();
		display();

	}
	// cannot be overriden, common implementation for all child class
	static void info()
	{
		System.out.println("Geometry shapes by Shuruti");
		show();
		//display();
	}
	
	// Java 9: private : static, instance, confidential
	private void display() // call in default method
	{
		System.out.println("Made in: ThinkQ");
		//show();

	}
	
	private static void show() // called in static and default method
	{
		System.out.println("Pan no: GH6790JH");


	}

	// private void name(){
	// 	System.out.println("Hello");
	// }
	
}

class Square implements Calculate
{
	
	int side;

	Square() {
		side = 10;
	}

	Square(int side) {
		this.side = side;
	}

	@Override
	public void area() {
		System.out.println("Area of square is:"+(side*side));
		
	}

	@Override
	public void perimeter() {
		System.out.println("Perimeter of square:"+(4*side));
	}

	


}

class Cube implements Calculate{
	
	int side;

	Cube() {
		side = 20;
	}

	Cube(int side) {
		this.side = side;
	}

	@Override
	public void area() {
		System.out.println("Area of cube:"+(6*side*side));;
		
	}

	@Override
	public void perimeter() {
		System.out.println("Perimeter of cube is :" + (12 * side));
		
	}
	
	public void volume()
	{
		  Calculate.super.volume();
		 System.out.println("Volume of cube :"+(side*side*side));
	}
}
public class AdvanceFeatures {

	public static void main(String[] args) {
		
		Calculate.info();
		Calculate c;
		c= new Square(4);
		c.area();
		c.volume();
		c.perimeter();
		
		c= new Cube(7);
		c.area();
		c.volume();
		c.perimeter();
	}
}
