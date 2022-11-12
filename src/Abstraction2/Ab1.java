package Abstraction2;

public class Ab1 implements Abstraction1 
{
	
	public void method1()
	{
		System.out.println("complete method 1");
		
	}
	
	public void method2() 
	{
	   System.out.println("complete method");	
		
	}
	
	
	public static void main(String[] args) 
	{
		Ab1 x = new Ab1();
		x.method1();
		
	}
	
	

}
