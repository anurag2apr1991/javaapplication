import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Department {
	
	public int deptID;
	public String deptName;
	public List<Employees> deptEmployees ;
	
			
//	1. DataType for list of department
//	2. Create list of employees in a department
//  3. fetch out the list of employees in a department
	
	public Department() {
		
	}


	public int getDeptID() {
		return deptID;
	}


	public void setDeptID(int deptID) {
		this.deptID = deptID;
	}


	public String getDeptName() {
		return deptName;
	}


	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}


	public List<Employees> getDeptEmployees() {
		return deptEmployees;
	}


	public void setDeptEmployees(List<Employees> deptEmployees) {
		this.deptEmployees = deptEmployees;
	}
	
	
}
