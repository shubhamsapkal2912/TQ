package constructor;
// static
// memory management
//share the same variable or method of a given class
// variables, methods, blocks, and nested classes.

//belongs to the class rather than an instance of the class
// directly called with the class name


public class StaticDemo1 {
	
	int x=10; // object // load at run time
	static int y=10; // associated with class: load at compile time
	
	
	void show() // object creation: run time
	{
		// static and instance both can be accessed
		x++;
		y++;
		System.out.println("x:"+x);
		System.out.println("y:"+y);
		
	}
	
	static void display() // compile time
	{
		int y=20; // local var
		StaticDemo1 obj= new StaticDemo1();
		System.out.println("x:"+obj.x); // cannot access instance variable directly
		System.out.println("y:"+y);
		System.out.println("Static y:"+StaticDemo1.y);
	
	}
	
	public static void main(String[] args) {
		StaticDemo1 s1= new StaticDemo1();
		s1.show();
		
		System.out.println("------------------------");
		StaticDemo1 s2= new StaticDemo1();
		s2.show();
		
		StaticDemo1.display();
		
	}

}
