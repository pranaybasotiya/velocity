package Abstractclass;

public abstract class Abstraction11 

{
//1 complete non-static method	
   public void method1()
   {
	   System.out.println("complete non static method ");
   }
   
 //2 incomplete non-static/abstract method
   public abstract void method2();
   
   
  //3 complete static method ->possible
   public static void method3()
   {
	   System.out.println("complete static method 3");
   }
   
   public static void main(String[] args) 
   {
	 method3();
   }
   
}
