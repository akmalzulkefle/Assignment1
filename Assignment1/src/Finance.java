import java.util.Scanner;

public class Finance {								//to create sub-class Finance

	final double Insurance = 5000;
	
	Scanner s = new Scanner(System.in);				//to answer question 1.2 Pre-Define Class for using Scanner
	
	private double operationCost, Sales, Profit;

	Finance(){										//constructor with no arguments
		
	}
	
	public double ProfitLoss() {					//to answer question 1.3 User Define Class for using this method
		
		double Sales, TotalOperationCost, fuelCost, wagesExpense, totalEmployee, totalWagesExpense, vehicleServiceExpense;
		
		System.out.println("All the amount must be input for a month.");
		System.out.print("Please Enter Your Sales : ");
		Sales = s.nextDouble();
		System.out.print("Please Enter Your Fuel Cost : ");
		fuelCost = s.nextDouble();
		System.out.print("Please Enter Your Wages Expense : ");
		wagesExpense = s.nextDouble();
		System.out.print("Please Enter Your Total Employee : ");
		totalEmployee = s.nextDouble();
		totalWagesExpense = wagesExpense*totalEmployee;
		System.out.printf("Your Total Wages Expense : %.2f\n",totalWagesExpense);
		System.out.print("Please Enter Your Vehicle Service Expense : ");
		vehicleServiceExpense = s.nextDouble();
		System.out.printf("Your Insurance Payment : %.2f\n",Insurance);
		TotalOperationCost = fuelCost + totalWagesExpense + vehicleServiceExpense + Insurance;
		System.out.printf("Your Total Operation Cost : %.2f\n",TotalOperationCost);
		Profit = Sales - TotalOperationCost;
		//ProfitLoss();
		
		if(Sales-TotalOperationCost>0){
			System.out.println("Profit : " + (Sales-TotalOperationCost));
        } 
		else if(Sales-TotalOperationCost<0){
			System.out.println("Loss :" + (Sales-TotalOperationCost));
        } 
		return Profit;
		
	}
	
	public double operationCost() {
		return this.operationCost;
	}
	
	public double Sales() {
		return this.Sales;
	}
	
	public double Insurance() {
		return this.Insurance;
	}
	
	public double Profit() {
		return this.Profit;
	}
	
}