package Casting;

public class Interface2 implements InterfacePranay 

{
	public void method3()
	{
		System.out.println("Method-3");
	}
	
	public void method4()
	{
		System.out.println("Method-4");
	}

	@Override
	public void method1() 
	{
		System.out.println("Method-1");
		
	}

	@Override
	public void method2() 
	{
		System.out.println("Method-2");
		
	}
	
	public static void main(String[] args) 
	{
		InterfacePranay x=new Interface2();
		x.method1();
		x.method2();
		
	}
	

}
