package com.encapsulation;
//import java.util.*;
public class Book {
    private String bookName;
    private int id;
    private String authorName;
    private double price;

    public void setBookname(String bName){
        this.bookName=bName;
    }
    public void setAuthorname(String aName){
        this.authorName=aName;
    }
    public void setId(int id){
        this.id=id;
    }
    public void setPrice(double price){
        this.price=price;
    }
    public String getBookname(){
        return bookName;
    }
    public String getAuthorname(){
        return authorName;
    }
    public int getId(){
        return id;
    }
    public double getPrice(){
        return price;
    }
    public void displayBook(){
        System.out.println("Book name "+bookName);
        System.out.println("Book author "+authorName);
        System.out.println("Book id "+id);
        System.out.println("Book price "+price);
    }
   public static void main(String[] args) {
    
   }
    
}
