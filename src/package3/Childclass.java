package package3;

public class Childclass extends Parentclass

{

	public void method2()
	{
		System.out.println("method1.1");
	}
	
	public static void main(String[] args) 
	
	{
		
//		//Non static variable
//		Parentclass x =new Parentclass();
//
//		//non static var
//		System.out.println(x.a);
//
//		//non static method
//		x.method1();
		
		
//////////////////////////////inheritance///////////////////////////////	
		
		   Childclass x=new Childclass();
		   System.out.println(x.a);
		   x.method1();
		//---------------------------------   
		   x.method2();
		   
	   	
	}

}
