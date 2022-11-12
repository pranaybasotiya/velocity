package Abstractclass;

public abstract class Absincomplete 

{
	
	public void method1()
	{
		System.out.println("abstract class with complete method");
	}
	
	//abstract method
	//method body - absent
	
	public abstract void  method2();
	
	
	//main
	
	public static void main(String[] args) 
	{
		//we can't call 
		Absincomplete x=new Absincomplete();
	}
	
}
