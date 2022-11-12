package This;

public class studentmarks
{
	//case-1
//   int studentmarks;
//   
//   public studentmarks()
//   {
//	   studentmarks =100;
//	   System.out.println("marks is"+ studentmarks);
//   }
//   
//   public static void main(String[] args) 
//   {
//	   studentmarks x = new studentmarks();
//   }
	
	int studentmarks;//global
	   
	   public studentmarks(int studentmarks) //local
	   {
		   this.studentmarks =studentmarks;
		   System.out.println("marks is"+ studentmarks);
	   }
	   
	   public static void main(String[] args) 
	   {
		   studentmarks x = new studentmarks(100);
	   }
}
