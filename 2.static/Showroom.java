//package com.staticdemo;

public class Showroom {

	public static void main(String[] args) {
		
		System.out.println(Car.getBrand());
		Car.setBrand("Hyundai");
		Car c1= new Car(101,"Creta",320000);
		Car c2= new Car(102,"i20",20000);
		Car c3= new Car(103,"Alcazar",25000);
		Car c4= new Car(104,"Ionic5",520000);
		Car c5 = new Car();
		c5.setName("NewCar");
		c5.setPrice(400000);
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
		System.out.println(c5);

		
		System.out.println("Total cars:"+Car.getCarCount());
		System.out.println("Total Revenue:"+Car.getTotalRevenue());
	}
}
