//package com.interfacedemo;

interface MessageS
{
  void processMessage(String msg);	

}

class Whatsapp implements MessageS
{
	String userName;
	
	Whatsapp()
	{
		
	}
	
	Whatsapp(String username)
	{
		this.userName=username;
	}

	@Override
	public void processMessage(String msg) {
		System.out.println("Whatsapp Message:"+msg);
		System.out.println("From:"+userName);
		
	}
  

}

class Facebook implements MessageS
{
	@Override
	public void processMessage(String msg) {
		System.out.println("Facebook notification:"+msg);
				
	}
  

}
public class TightCouplingDemo {
	
//	// tight coupling
//	public void messageType(Whatsapp w, String msg)
//	{
//		w.processMessage(msg);
//	}
//	
//	public void messageType(Facebook f, String msg)
//	{
//		f.processMessage(msg);
//	}
	
	// loose coupling
	
	public void messageType(MessageS ser, String msg)
	{
		ser.processMessage(msg);
	}
	
	public static void main(String[] args) {
		
		TightCouplingDemo obj= new TightCouplingDemo();
		
	   
//	   Whatsapp w1= new Whatsapp("Shuruti");
//	   
//	   obj.messageType(w1, "Hello how are you");
//	   
//	   Facebook f1 = new Facebook();
//	  obj.messageType(f1, "New Request");
		
		MessageS service;
		
		obj.messageType(new Whatsapp("Shuruti"), "Hi");
		obj.messageType(new Facebook(), "New friend request");
		
		service= new Whatsapp("Shaila");
		obj.messageType(service, "Great");
		
	}

}
