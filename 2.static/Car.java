//package com.staticdemo;

public class Car {
	
	private int carNo;
	private String name;
	private double price;
	
	//private int x=10;
	//private static String brand="Hyundai";
	private static String brand="BMW";
	public static int carCount;
	public static double totalRevenue;
	
	// Hit counter
	// common calculations
	
	// car:count
	// revenue: earned
	
	static
	{
		brand="Honda";
		carCount=0;
		totalRevenue=0;		
	}
	
	// code that has to exceuted at object creation
	// common code : constuctor
	
	// called for every object
	//iib
	{
//		System.out.println(x);
//		x=12;
		carCount++;
		//price=20000;
	}
	
	public Car() {
		//carCount++;
	}
	public Car(int carNo, String name, double price) {
		//super();
		this.carNo = carNo;
		this.name = name;
		this.price = price;
		setTotalRevenue();
		//carCount++;
	}
	public int getCarNo() {
		return carNo;
	}
	public void setCarNo(int carNo) {
		this.carNo = carNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
		setTotalRevenue();
	}
	
	public static void setBrand(String brand)
	{
		Car.brand=brand;
	}
	
	public static String getBrand()
	{
		return brand;
	}
	
	public static int getCarCount()
	{
		return carCount;
	}
	
	public  void setTotalRevenue()
	{
		totalRevenue= totalRevenue+ this.price;
	}
	
	public static double getTotalRevenue()
	{
		return totalRevenue;
	}

	public String toString() {
		return "Car [carNo=" + carNo + ", name=" + name + ", price=" + price +" , brand=" + brand+"]";
	}
	public static void main(String[] args) {
		
	}
	

}
