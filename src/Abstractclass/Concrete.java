package Abstractclass;

public class Concrete extends Absincomplete
{
	public  void  method2()
	{
		System.out.println("method2 abstract class");
	}
	
	public static void main(String[] args) 
	{
		Concrete x = new Concrete();
		x.method1();
		x.method2();
	}

}
