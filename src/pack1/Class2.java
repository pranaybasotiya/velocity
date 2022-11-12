package pack1;

public class Class2 

{
  public static void main(String[] args) 
  
  {
	//static var
		System.out.println(Class1.a);
		
		
		//static method
		Class1.method1();
		
		//non static method
		Class1 x =new Class1();
		
		System.out.println(x.b);
		x.method2();
  }
	
}
