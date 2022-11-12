package method;

public class returntype {
	//non return type method--> void
	//return type method
	//return type-->int, byte,short,char long, flaot , double,String
	
	public static int addition() {
		
		int a=100;
		int b=200;
		int c=a+b;
		
		System.out.println("Addition is" +c);
		
		return a;
	}
	
	public static void main(String []args) {
		
		int z=addition();
		
		System.out.println("value of x is"+z);
		
		System.out.println(z+100);
		
		
	}

}
