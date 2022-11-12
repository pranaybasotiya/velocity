package oops;

public class ParentClass 
{
	public int a=100;
	
	public void method1() 
	{
		System.out.println("method=Parent1");
		
	}
	
	//main
	public static void main(String[] args) 
	
	{
		ParentClass x =new ParentClass();

		//non static var
		System.out.println(x.a);

		//non static method
		x.method1();
		
	}

}
