package methodoverloading;

public class program1 {
	
	//method overloading
	//same method
	//different argument

	public static void method1()
	//ex:1
	{
		System.out.println("without arg");

	}
	//ex:2
	public static void method1(char y)
	{
	      System.out.println("static method2");	
	}
	//ex:3
	public static void method1(int y)
	{
	      System.out.println("static method3");	
	}
	
	public static void main(String[] args) {
		
		method1();
		method1('A');
		method1(10);
	}

}
