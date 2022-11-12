package method;

public class argmwithreturntype {
	
	public static int method1 (char y)
	{
		System.out.println("int with arg");
		return 400;
	}
	
	public static void main(String[] args) {
		
		method1 ('A');        
		int x= method1 ('A');  
		System.out.println(x);
		System.out.println(x+100);
	}

}
