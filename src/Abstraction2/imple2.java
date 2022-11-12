package Abstraction2;

public class imple2 implements Interface2 
{
  
	public void method()
	{
		System.out.println("method");
	}
	
	public static void main(String[] args) 
	{
		imple2 x =new imple2 ();
	
		
		x.method();
		Interface2 .method1();
	}
}
