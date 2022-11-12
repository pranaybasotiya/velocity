package Super;

public class Childclass extends Parentclass
{
		String name="Rushikesh-childclass";
		
		
		public void printname()
		{
			System.out.println("name");
			
			System.out.println(super.name);
		}
		
		public static void main(String[] args)
		{
			Childclass x=new Childclass();
			x.printname();
		}
		
}
