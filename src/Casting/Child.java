package Casting;

public class Child extends parent
{
    public void method3()
    {
    	System.out.println("Method 3 -child class");
    }
    
    public void method4()
    {
    	System.out.println("Method 4 -child class");
    }
    
    public static void main(String[] args) 
    {
//    	parent x=new parent ();
//    	x.method1();
//    	x.method2();
//    	
//    	Child y=new Child();
//    	y.method3();
//    	y.method4();
    	
  /////////////////////Inheritance//////////////////////////////  
    	
//    	Child z=new Child();
//    	 z.method1();//parent
//    	 z.method2();//parent
//    	 
//    	 z.method3();//Child
//    	 z.method4();//Child
    	
  ///////////////////////Upcasting/////////////////////////////// 
    	
    	parent x=new Child();
    	
    	x.method1();//parent class
    	x.method2();//parent class
    	
//    	x.method3();//child class(not possible)
//    	x.method3();//child class(not possible)
    	
    	 
    	 
    	
	}
    
}
