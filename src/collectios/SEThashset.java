package collectios;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class SEThashset 
{
	
	public static void main(String[] args) 
	
	{
		
		//Hashseet class
//		HashSet a=new HashSet();
//		a.add(10);
//		a.add(20);
//		a.add(30);
		
		//System.out.println(a);
		
//		a.add("ABC");
//		a.add(123);
//		a.add(1.23);
//		
//		System.out.println(a);
		
		//Iterator print horizantally
		
//		Iterator it =a.iterator();
//		System.out.println(it.next());
//		System.out.println(it.next());
//		System.out.println(it.next());
//		System.out.println(it.next());
//		System.out.println(it.next());
//		
//		HashSet<Integer> b=new HashSet<Integer>();
//		HashSet<String>  c=new HashSet<String>();
		
		LinkedHashSet<Character>y=new LinkedHashSet<Character>();
		y.add('A');
		y.add('B');
		y.add('c');
		System.out.println(y);
		 
		Iterator ab =y.iterator();
//		System.out.println(ab.next());
//		System.out.println(ab.next());
//		System.out.println(ab.next());
//		
		for (int i=1;i<=y.size();i++)
		{
			System.out.println(ab.next());
		}
		
		
	}

}
