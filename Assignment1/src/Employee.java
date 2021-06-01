import java.util.Scanner;

public class Employee {								//to create sub-class Employee 

	final double Tax_Amount = 0.05;
	
	Scanner s = new Scanner(System.in);				//to answer question 1.2 Pre-Define Class for using Scanner
	
	 private String name, position;
	 private int StaffID;
	 private double TotalNetSalary;
	 
	 Employee(String position){						//to answer question 1.4 Constructor for using constructor with one-arguments
		 
		 this.position = position;
	 }
	 
	 Employee(String name, int StaffID){			//to answer question 1.4 Constructor for using constructor with two-arguments
		 
		 this.name = name;
		 this.StaffID = StaffID;
	 }
	 
	 Employee(double TotalNetSalary, double Tax_Amount){								
		 
		 Salary();
		 
		 }
	 	 
	public double  Salary() {						//to answer question 1.3 User Define Class for using this method
		
		double MonthlySalary, NumberOfDaysWork, NumberOfDayMonth, TotalSalary, TotalNetSalary;
		
		System.out.print("Enter MonthlySalary : RM ");
		MonthlySalary=s.nextDouble();
		System.out.print("Enter NumberOfDaysWork : ");
		NumberOfDaysWork=s.nextDouble();
		System.out.print("Enter NumberOfDayMonth : ");
		NumberOfDayMonth=s.nextDouble();
		TotalSalary=(MonthlySalary*NumberOfDaysWork)/NumberOfDayMonth;
		System.out.printf("Your TotalSalary : RM%.2f\n",TotalSalary);
		TotalNetSalary = TotalSalary - (TotalSalary*Tax_Amount);
		System.out.printf("Your TotalNetSalary : RM%.2f\n",TotalNetSalary);
		return TotalNetSalary;
		
			}
	
	 public String getName() {
	        return this.name;
	    }
	 
	 public String getPosition() {
		 	return this.position;
	 }
 
	 public Integer getStaffID() {
	        return this.StaffID;
	    }

	 public double getTotalNetSalary() {
	        return this.TotalNetSalary;
	    }
	
}
