package method;

public class TConstructor {
	
        int a;
		int b;
		
		// ex.1
		
		public TConstructor()
		{
			a=0;
			System.out.println(a);
			b=50;
			System.out.println(b);
		}
		
		
		//ex .2
		public TConstructor(int x)
		{
			a=100;
			System.out.println(a);
			b=200;
			System.out.println(b);
		} 
		
		
		
		//ex .3
				public TConstructor(char z)
				{
					a=1000;
					System.out.println(a);
					b=2000;
					System.out.println(b);
				} 
				
				
		public static void main(String[] args) {
			//ex.1
			TConstructor pranay=new TConstructor();
			
			//ex.2
			TConstructor Basotiya=new TConstructor(55);
			
			//ex.3
			TConstructor saoner=new TConstructor('A');
			
		}


}


