package method;

public class Constructor {
	
int a ;
	
	public Constructor()
	{
		a=100;
		System.out.println("value of a is-" +a);
	}
	
	public void method1()
	{
		System.out.println("method1-non static");
	}
	
	
	public static void main(String[] args) 
	{
		//const call
		Constructor rahul = new Constructor();
		
		rahul.method1();
	}


}
