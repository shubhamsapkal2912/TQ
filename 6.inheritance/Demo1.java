

public class Demo1 {

	public static void main(String[] args) {
		
		// within package: only private is not accessible
		
		AccessSp obj= new AccessSp();
	//	obj.a=90;
		obj.b=90;
		obj.c=90;
		obj.d=90;
		
	//	obj.show();
		obj.display();
		obj.display1();
		obj.printMe();
	}
}
