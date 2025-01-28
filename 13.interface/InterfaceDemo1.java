//package com.interfacedemo;

// is a relationship
// it is not compulsory that class have to be hierarchy
// we have to compulsory override abstract method
// var: public static and final// method: public abstract
// contract b/w client and developer
// design pattern : dynamic method dispatch
// hiding the implementation

interface Speedable
{
   int speed=70; // public static final
    void move();// public abstract
 }

class Car implements Speedable
{

	public void move() {
		System.out.println("Car is moving at:"+speed);
		
	}
	
	public void display()
	{
		System.out.println("In car display");
	}
	
	// be default the access specifier of method is public 
	// we cannot reduce the visibility
	
//	@Override
//	void move()
//	{
//		
//	}
	

}

class Ball implements Speedable
{

	@Override
	public void move() {
		System.out.println("Ball is rolling at:"+speed);
		
	}
}

public class InterfaceDemo1 {
	
	public static void main(String[] args) {
		
		Speedable s;
		s= new Car();
		s.move();
		//s.display();
		
	}

}
