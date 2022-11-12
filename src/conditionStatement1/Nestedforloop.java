package conditionStatement1;

public class Nestedforloop {
	
	
	
 public static void main(String[]args)
 
 
 {
	 
	 //Society 1-2-3-4-5//outer society 
	 //flat 1-2-3-4-5//inner society
	 
	 for(int i=1 ; i<=5;i++)         //outer society 
		  {
		 
		 System.out.println("Society-"+i);
		 
	      for(int j=1; j<=5;j++)      //inner society
		
		
	  {
		 System.out.println("Flats-"+j);
	  }
		
	      
	       }
 }


}
