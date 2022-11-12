package oops;

public class ChildClass 

{
	public static void main(String[] args) 
	{
		ParentClass y =new ParentClass();

		//non static var
		System.out.println(y.a);

		//non static method
		y.method1();
	}

}
