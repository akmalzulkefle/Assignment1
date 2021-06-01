
import java.util.Scanner;

public class CustomerRegistration {										//to create sub-class Customer Registration

	Scanner s = new Scanner(System.in);									//to answer question 1.2 Pre-Define Class for using Scanner
	
	private String CustName, IdentityNumber, ContactNumber;
	private int NumberOfPassengers;
	
	CustomerRegistration(){												//to answer question 1.4 Constructor for using constructor with no-arguments
		
		System.out.println("Please fill your personal information below.");
		System.out.print("Please Enter Your Name : ");
		this.CustName = s.nextLine();
		System.out.print("Please Enter Your Identity Number :");
		this.IdentityNumber = s.nextLine();
		System.out.print("Please Enter Your Contact Number :");
		this.ContactNumber = s.nextLine();
		System.out.print("How Many Passengers :");
		this.NumberOfPassengers = s.nextInt();
		
	}

	public String CustName() {
		return this.CustName;
	}
	
	public String IdentityNumber() {
		return this.IdentityNumber;
	}
	
	public String ContactNumber() {
		return this.ContactNumber;
	}
	
	public Integer NumberOfPassengers() {
		return this.NumberOfPassengers;
	}

}
