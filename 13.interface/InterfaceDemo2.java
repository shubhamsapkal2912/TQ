//package com.interfacedemo;

interface Add
{
  void add(int a,int b);	

}

interface Sub
{
  void sub(int a,int b);
  void add(int a,int b);	

}

class Calculator implements Add,Sub
{

	@Override
	public void sub(int a, int b) {
		System.out.println((a-b));
		
	}

	@Override
	public void add(int a, int b) {
		System.out.println((a+b));
		
	}
}

public class InterfaceDemo2 {
	
	public static void main(String[] args) {
		
	  Calculator c1= new Calculator();
	  c1.add(4, 5);
	  c1.sub(48,2);
	}

}
