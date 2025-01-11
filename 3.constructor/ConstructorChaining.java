package constructor;

//Calling one constructor from another constructor with respect to current object

//done through this() ... within the same class

class Demo
{
	
  private int a;
  private int b;
  private String name;
  
  Demo()
  {
	  //this(-1,-1);
	  System.out.println("In default constructor");
	  a=-1;
	  b=-1;
	  name="Unknown";
  }
  
  Demo(int a,int b)
  {
	  this();
	  System.out.println("Param constructor 1");
	  this.a=a;
	  this.b=b;
	 
	  
  }
  
//  Demo(int a,int b)
//  {
//	  System.out.println("Param constructor 1");
//	  this.a=a;
//	  this.b=b;
//	  name="Unknown";
//	  
//  }
  
//  Demo()
//  {
//	// 
//	  this(-1,-1); // first statement
//	  System.out.println("In def const");
//  }
  
  Demo(int a,int b,String name)
	{
		System.out.println("Param constructor 2");
		this.a=a;
		this.b=b;
		this.name=name;
	}
  
  public String toString()
	{
		return " a:"+a+"\n b:"+ b+"\n name:"+name;
	}

}

public class ConstructorChaining {
	
	public static void main(String[] args) {
		
		System.out.println("------------------------------------------");
		Demo d1= new Demo();
		System.out.println(d1);
		
		System.out.println("------------------------------------------");
		Demo d2=new Demo(30,40);
		System.out.println(d2);
		
		System.out.println("------------------------------------------");
		Demo d3= new Demo(100,200,"Shuruti");
		System.out.println(d3);
		
	}

}
