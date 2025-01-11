package com.encapsulation;
import java.util.*;
public class Library {
    static Scanner sc=new Scanner(System.in);

    static void enterBookDetails(Book b){
        System.out.println("Enter book name");
        b.setBookname(sc.next());
        System.out.println("Enter book author");
        b.setAuthorname(sc.next());
        System.out.println("Enter book id");
        b.setId(sc.nextInt());
        System.out.println("Enter book price");
        b.setPrice(sc.nextDouble());
    }
  public static void main(String[] args) {
    Book b1=new Book();
    enterBookDetails(b1);
    Book b2=new Book();
    enterBookDetails(b2);
    b1.displayBook();
    b2.displayBook();
  }  
}
