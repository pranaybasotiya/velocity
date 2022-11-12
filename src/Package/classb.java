 package Package;

public class classb {
	public static void main(String[] args) {
		
		//static var
		System.out.println(classA.a);
		
		//static method
		classA.method1();
		
		//*******************
		
		//non-static
		
		classA xobject=new classA();
		//non static var
		System.out.println(xobject.b);
		
		//non static method
		
		xobject.method2();
		
	}

}
