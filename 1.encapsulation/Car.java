package com.encapsulation;

public class Car {
private String model;
private double mileage;
private String color;
private int window;

public void setModel(String model){
    this.model=model;
}
public void setMileage(double mileage){
    this.mileage=mileage;
}
public void setColor(String color){
    this.color=color;
}
public void setWindow(int window){
    this.window=window;
}

public String getModel(){
    return model;
}
public double getMileage(){
    return mileage;
}
public String getColor(){
    return color;
}
public int getWindow(){
    return window;
}

public void CreateCar(String model,String color,int window,double mileage){
    this.mileage=mileage;
    this.model=model;
    this.window=window;
    this.color=color;
}
public void DisplayCar(){
    System.out.println("Model :"+model);
    System.out.println("Color :"+color);
    System.out.println("Mileage :"+mileage);
    System.out.println("Window :"+window);
}
    public static void main(String[] args) {
        Car punch=new Car();
        punch.setMileage(19.2);
        punch.setWindow(4);
        punch.setColor("Black");
        punch.setModel("Adventure+Rhythm");

        System.out.println("Model :"+punch.getModel());
        System.out.println("Color :"+punch.getColor());
        System.out.println("Mileage :"+punch.getMileage());
        System.out.println("Window :"+punch.getWindow());

        Car tiago=new Car();
        tiago.CreateCar("XM+", "Black", 4, 20.00);
        tiago.DisplayCar();
    }
    
}