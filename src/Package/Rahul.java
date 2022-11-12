package Package;

public class Rahul 
{
	public static void main(String[] args) 
	{
		//static var
		System.out.println(classA.a);
		
		//static method
		classA.method1();
	//********************************************	
		//non static
		classA xpra=new classA();
		
		//non static var
		System.out.println(xpra.b);
		
		//non static method
		xpra.method2();
		
		
	}

}
