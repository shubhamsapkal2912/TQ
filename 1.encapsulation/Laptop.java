package com.encapsulation;

public class Laptop {
    private String companyName;
    private String modelName;
    private double price;

    public void setCompanyName(String companyName){
        this.companyName=companyName;
    }
    public void setModelName(String modelName){
        this.modelName=modelName;
    }
    public void setPrice(double price){
        this.price=price;
    }
    public String getCompanyName(){
        return companyName;
    }
    public String getModelName(){
        return modelName;
    }
    public double getPrice(){
        return price;
    }
    public void DisplayLaptop(){
        System.out.println("Company name :" +companyName);
        System.out.println("Model :" +modelName);
        System.out.println("Price  :"+price);
    }
}
