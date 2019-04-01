
public class Employees {
	
	public int empID;
	public String empName;
	public int empSalary;
	
	public Employees() {
		
	}
	
	public void Employees(int EmployeeID, String EmpName, int EmplSalary){
		
		this.empID = EmployeeID;
		this.empName = EmpName;
		this.empSalary = EmplSalary;
		

	}

	public int getEmpID() {
		return empID;
	}

	public void setEmpID(int empID) {
		this.empID = empID;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(int empSalary) {
		this.empSalary = empSalary;
	}
	

}
