//package com.interfacedemo;

interface Movable
{
  void move(float speed);	

}

interface SpeedUp extends Movable
{
	
   void changeSpeed(float speed);

}

class Truck implements SpeedUp
{

	@Override
	public void move(float speed) {
		System.out.println("Speed:"+speed);
		
	}

	@Override
	public void changeSpeed(float speed) {
		System.out.println("Speed increased :"+speed);
		
	}
	


}


public class ExtendsInterface {
	
	public static void main(String[] args) {
		
		Movable m1;
		m1= new Truck();
		m1.move(90);
		
		SpeedUp s1;
		s1= new Truck();
		s1.move(90);
		s1.changeSpeed(10);
		
		
	}
	
	

}
