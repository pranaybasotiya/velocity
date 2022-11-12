package methodoverloading;

public class program2 {
	
	public static void addition(int x,int y)
	{
		
		
		int a=x;
		int b=y;
		int c=a+b;
		
		System.out.println(c);
	}
	
	public static void addition(int x,int y,int z)
	{
		
		
		int a=x;
		int b=y;
		int c=z;
		int d=a+b+c;
		
		System.out.println(d);
	}
	
	public static void main(String[] args) 
	{
		addition(10,20);
		addition(20,30,20);
		
	}
	
	
	
	

}
