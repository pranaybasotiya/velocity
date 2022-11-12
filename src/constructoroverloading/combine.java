package constructoroverloading;



public class combine {
	String name;
	int rollno;
	double percentage;
	char grade;
	String emailId;
	String batchname;
	long mobile;

	
	//pranay data
	
	public combine()
	{
			name ="Pranay";
			rollno=2411;
			percentage=55.89;
			grade='C';
			emailId="pranay22@gmail.com";
		    batchname="29evebatch";
			mobile=78182828L;
			
			System.out.println("name is"+name +"Roll no is"+rollno 
					           +"percentage is"+percentage
					           +"grade is"+grade +"emailId is"+emailId 
					           +"batchname is"+batchname 
					           +"mobile no"+mobile);
		
		
	}
	
	//Sammer data
	public combine(int y)
	{
			name ="Sammer";
			rollno=3434;
			percentage=55.89;
			grade='C';
			emailId="pranay22@gmail.com";
		    batchname="29evebatch";
			mobile=78182828L;
			
			System.out.println("name is"+name +"Roll no is"+rollno 
					           +"percentage is"+percentage
					           +"grade is"+grade +"emailId is"+emailId 
					           +"batchname is"+batchname 
					           +"mobile no"+mobile);
	}
			
			
	
	public static void main(String[] args) 
	{
		//pranay data
		combine pranay=new combine();
		
		//Sammer data
		combine sammer =new combine(4);
		
		
	}

}
