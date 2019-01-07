import java.util.Scanner;

public class Operation {

	public Operation() {
		operations();
	  	
	}
	
	public void operations() {
		System.out.println("Choose one option from following : ");
	  	System.out.println("1) Add a new employee.");
	  	System.out.println("2) Delete an employee via SSN.");
	  	System.out.println("3) Retrive an employee via SSN.");
	  	System.out.println("4) List all employees.");
	  	System.out.println("5) Exit.");
	  	Scanner sc = new Scanner(System.in);
	  	int selectedOption = sc.nextInt();
	  	selectOption(selectedOption);
	  
	}
	public void selectOption(int a) {
		
		switch (a) { 
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
	
