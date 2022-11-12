package Interface;

public interface program1 
{
	//1.incomplete methods
		public abstract void method1();
		
		//2.incomplete method-
		//methods-by default-> public and abstract
		void method2();
		
		
		//3.complete method-> not possible
//		public void method3()
//		{
//			System.out.println("method3-interface");
//		}
		
		public static void main(String[] args)
		{
			//call like static-> not possible
//			method1();
//			method2();
			
			//call like non static->not possible
//			AnilInterface x = new AnilInterface();
//			x.method1();
//			x.method2();
			
			
		}

}
