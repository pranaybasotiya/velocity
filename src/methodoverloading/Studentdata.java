package methodoverloading;

//import constructoroverloading.combine;

public class Studentdata {
	
	String name;
	int rollno;
	double percentage;
	char grade;
	String emailId;
	String batchname;
	long mobile;
	
	
	//studentinformation
	
	public void Studentdata() 
	{
		System.out.println("name is"+name +"Roll no is"+rollno 
		           +"percentage is"+percentage
		           +"grade is"+grade +"emailId is"+emailId 
		           +"batchname is"+batchname 
		           +"mobile no"+mobile);

	}

	
	//pranay data
	
	public Studentdata()
	{
			name ="Pranay";
			rollno=2411;
			percentage=55.89;
			grade='C';
			emailId="pranay22@gmail.com";
		    batchname="29evebatch";
			mobile=78182828L;
			
			
			
			
		
	}
	
	//Sammer data
	public Studentdata(int y)
	{
			name ="Sammer";
			rollno=3434;
			percentage=55.89;
			grade='C';
			emailId="pranay22@gmail.com";
		    batchname="29evebatch";
			mobile=78182828L;
			
		
	}
			
			
	
	public static void main(String[] args) 
	{
		//pranay data
		Studentdata pranay=new Studentdata();
		pranay.Studentdata();
		
		//Sammer data
		Studentdata sammer =new Studentdata(4);
		sammer.Studentdata();
		
		
	}



}
