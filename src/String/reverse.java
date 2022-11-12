 package String;

public class reverse 

{
	
	public static void main(String[] args) 
	
	{
		String a="Pranay";
		System.out.println("Pranay");
				
	    String rev=" ";
	    
	    char x;
	    
	    for(int i=0;i<a.length();i++)
	    {
	    	x=a.charAt(i);
	    	rev=x+rev;
	    }
	    System.out.println("Reverse is ->"+rev);
	}

}
