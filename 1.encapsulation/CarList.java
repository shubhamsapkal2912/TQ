package com.encapsulation;
import java.util.*;
public class CarList {
    static Scanner sc=new Scanner(System.in);
    static void enterCarDetail(Car c){
        System.out.println("Enter car model");
        c.setModel(sc.next());
        System.out.println("Enter car mileage");
        c.setMileage(sc.nextDouble());
        System.out.println("Enter car color");
        c.setColor(sc.next());
        System.out.println("Enter car window");
        c.setWindow(sc.nextInt());
    }
    public static void main(String[] args) {
        Car c1=new Car();
        enterCarDetail(c1);
        System.out.println("-----------------------");
        c1.DisplayCar();
        System.out.println("-----------------------");

        Car c2=c1;
        c2.setColor("Black");
        System.out.println("-----------------------");
        c2.DisplayCar();
        System.out.println("-----------------------");
        c1.DisplayCar();
        System.out.println("-----------------------");

        Car c3=new Car();
        c3.setColor("Grey");
        c3.setMileage(c1.getMileage());
        c3.setModel(c1.getModel());
        c3.setWindow(c1.getWindow());


    }
}
