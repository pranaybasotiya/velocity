package method;

public class argwithoutarg {
	
	
   //ex.1
	public static void method1()
	{
		System.out.println("method1-zero arg");
	}
	
	
	//ex.2
	public static void method1(int x)
	{
		System.out.println("method1-int arg");
	}
	
	
	//ex.3
	public static void method1(char y)
	{
		System.out.println("method1-char arg");
	}
	
	
	
	public static void main(String[] args) 
	{
		
		//1
		method1();
	
		
		//2
		method1(100);
		method1(1000000);
		
	

		
		//ex.3
		method1('Z'); 
		
		
		
	}

}



