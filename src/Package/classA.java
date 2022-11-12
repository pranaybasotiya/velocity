package Package;

public class classA 

{

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
		   
		   //main
		   
		   public static void main(String[] args) 
		   {
			   
			  //static var call
			  System.out.println(a);
			  		//or
			  System.out.println(classA.a);
			  
			  
			  //static method call
			  method1();
			  		//or
			  classA.method1();
			  
	    //*********non static*************		  
			 
			  classA x=new classA();
			  
			  System.out.println(x.b);
			  
			  x.method2();
			  
		
		   }
}
