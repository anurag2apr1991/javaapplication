import java.util.Scanner;

public class Operation {

	public Operation() {
		operations();
	  	
	}
	
	public void operations() {
		System.out.println("Choose one option from following : ");
	  	System.out.println("1) Find Department's List of Employees");
	  	System.out.println("2) Find Employee with highest Salary");
	  	System.out.println("3) Fetch Department's Total CTC");
	  	System.out.println("4) List all employees.");
	  	System.out.println("5) Exit.");
	  	Scanner Selection = new Scanner(System.in);
	  	int selectedOption = Selection.nextInt();
	  	selectOption(selectedOption);
	  
	}
	public void selectOption(int Selectedindex) {
		
		switch (Selectedindex) { 
        case 1: ListEmployees();
            break; 
        case 2: HighestSalary();
            break; 
        case 3: DeptTotalCTC();           
        	break;
        default:System.out.println("Incorrect Selection.");
        	operations();
            break; 
        } 
	}
		
		public void ListEmployees() {
			System.out.println("Enter a department name and all the employees associated with");
		}
		
		public void HighestSalary() {
			System.out.println("enter a department name and Employee having highest salary");
		}
		
		public void DeptTotalCTC() {
			System.out.println("Enter a department name and the total CTC");
		}
		
	}
	
