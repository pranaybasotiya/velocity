package method;

public class constructor2 {
	
	public constructor2() 
	{
		System.out.println("This is constructor");
	}

	//caling method
	public void method1()
	{
		System.out.println("method1-non static");
	}
	
	//main method
	
	public static void main(String[] args) {
		
		//create object
		
		constructor2 x=new constructor2();
		x.method1();
	}
}
