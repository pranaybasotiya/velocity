package collectios;

import java.util.ArrayList;



public class Intgr 

{
	public static void main(String[] args) 
	
	{
       ArrayList<Integer> b = new ArrayList<Integer>();
		
		b.add(10);
		b.add(23);
		b.add(50);
		b.add(10);
		b.add(70);
		b.add(80);
		b.add(90);
		b.add(100);
		
		System.out.println(b.get(2));
		
		System.out.println(b.get(2) + b.get(4));
		
		//replace
		b.set(3, 41);
		System.out.println("actual value"+b);
		System.out.println(b);
		
		//count size
		System.out.println("Total size"+b.size());
		
		//remove
		b.remove(2);
		System.out.println("Total size"+b.size());
		System.out.println(b);
		
	}
}
