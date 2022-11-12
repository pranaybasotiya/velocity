package package3;

import Package.classA;

public class Classd {

public static void main(String[] args) 
	
	//static variable call
	{
	  System.out.println(classA.a);	
	  
	//static method from class a
		
		classA.method1();
		
		
	//non static member
		classA xpra =new classA();
		
	//non static var
		System.out.println(xpra.b);
		
	//non static method
		xpra.method2();
	}
	
}
