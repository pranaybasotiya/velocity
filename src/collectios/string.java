package collectios;

import java.util.ArrayList;



public class string

{
	public static void main(String[] args) 
	
	{
		ArrayList<String> a=new ArrayList<String>();
		
		a.add("pra");
		a.add("nay");
		a.add("prat");
		a.add("ap");
		System.out.println(a);
		System.out.println(a.get(3));
		
		System.out.println(a.remove(3));
		System.out.println(a);
		System.out.println(a.size());
		
	}
}
