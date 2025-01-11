package com.encapsulation;
import java.util.*;
public class LaptopShop {
   static Scanner sc=new Scanner(System.in);
   static void enterLaptopDetail(Laptop l){
    System.out.println("Enter Laptop Company Name");
    l.setCompanyName(sc.next());
    System.out.println("Enter Laptop Model");
    l.setModelName(sc.next());
    System.out.println("Enter Laptop Price");
    l.setPrice(sc.nextDouble());
   } 
   public static void main(String[] args) {
    Laptop l1=new Laptop();
    enterLaptopDetail(l1);
    Laptop l2=l1;

    Laptop l3=new Laptop();
    l3.setCompanyName(l2.getCompanyName());
    l3.setModelName(l2.getModelName());
    l3.setPrice(99999);

    System.out.println("------------l1-----------");
    l1.DisplayLaptop();
    System.out.println("------------l2 shallow copy-----------");
    l2.DisplayLaptop();
    System.out.println("------------l3 deep copy-----------");
    l3.DisplayLaptop();
   }
}
