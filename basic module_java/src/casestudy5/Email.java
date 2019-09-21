package casestudy5;




import java.util.Scanner;
public class Email {
	String name;
	String address;
	String contactnumber;
	String emailid;
	String prooftype;
	String proofid;
	
	public static void Main(String[] args) {
		String name;
		String address;
		String contactnumber;
		String emailid;
		String prooftype;
		String proofid;
		String proceed = null;
	  	Scanner sc=new Scanner(System.in);

		do
		{
			System.out.println("Enter your name:");
		    name=sc.nextLine();
		    System.out.println("Enter your address:");
		    address=sc.nextLine();
            System.out.println("Enter your contactnumber:");
		    contactnumber=sc.nextLine();
		    System.out.println("Enter your emailid:");
		    emailid=sc.nextLine();
		    System.out.println("Enter your prooftype:");
            prooftype=sc.nextLine();
            System.out.println("Enter your proofid:");
            proofid=sc.nextLine();
            System.out.println("****THANK YOU FOR REGISTRATION****");
            System.out.println("DO YOU WANT TO CONTINUE:(Yes/No)");
            proceed=sc.nextLine();
		    }
		while(proceed.equalsIgnoreCase("Y"));
		    System.out.println("DO YOU WANT TO UPDATE YOUR EMAILID:(Yes/No)");
		    proceed=sc.nextLine();
		    while(proceed.equalsIgnoreCase("Y"))
		    {
		    System.out.println("UPDATE EMAILID:");
			System.out.println("Enter your new emailid:");
			 emailid=sc.nextLine();
			 System.out.println("UPDATE YOUR EMAILID:" +name);
			 System.out.println(":" +address);
			 System.out.println(":" +contactnumber);
			 System.out.println(":" +emailid);
			 System.out.println(":" +prooftype);
			 System.out.println(":" +proofid);
			 System.exit(0);
			 
		    }	 
	}
		
}