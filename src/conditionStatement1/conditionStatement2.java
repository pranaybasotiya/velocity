package conditionStatement1;

public class conditionStatement2 {
	
	public static void main(String args[]) {
		
//		int number=-1000000000;
//		
//		if(number>0) {
//			
//			System.out.println("number is positive");
//		}
//		
//		else if(number<0){
//			System.out.println("number is negative");
//		}
//		
//		else
//		{
//			System.out.println("my number is zero");
//		}
//			
//		System.out.println("End of program");
		
		
		
		int marks=40;
		
		if(marks>90 && marks<100)
		
		{
			
			System.out.println("Student Grade A");
			
		}
		
		else if(marks>80 && marks<90)
		
		{
			
			System.out.println("Student grade B");
		}
		
		else if(marks>70 && marks<80)
		{
			System.out.println("Student grade c");
		}
		
		
		else if(marks>40 && marks<70)
		{
			System.out.println("Student grade d");
		}
		
		
		else {
			
			System.out.println("Student is fails");
		}
		
		System.out.println("End of the program");
		
	}

}
