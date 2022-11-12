package Abstractclass;

public class Conctrete2 extends AbstractABclass
{

	@Override
	public void method1() 
	{
		System.out.println("method1 abstarct class method");
		
	}

	@Override
	public void method2() 
	{
		System.out.println("method2 abstarct class method");
		
	}

	@Override
	public void method3() 
	{
		System.out.println("method3 abstarct class method");
	}

	@Override
	public void method4() 
	{
		System.out.println("method4 abstarct class method");
        		
	}
	
	public static void main(String[] args) 
	{
		Conctrete2 x =new Conctrete2();
		x.method1();
		x.method2();
		x.method3();
		x.method4();
		
		
	}
	
	

}
