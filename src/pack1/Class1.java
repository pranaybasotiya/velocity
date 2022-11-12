package pack1;



public class Class1 {
	public static int a=100;
    public		   int b=200;
		   
		   
		   public static void method1() 
		   {
			   System.out.println("static method 1");
		   }
		   
		   public void method2()
		   {
			   System.out.println("non-method 2");
		   }
		   
		
		   public static void main(String[] args) 
		   
		   {
			 //static var
			System.out.println(a);
			
			
			//static method
			Class1.method1();
			
			//non static method
			Class1 x =new Class1();
			
			System.out.println(x.b);
			x.method2();
			
		
		   }

}
