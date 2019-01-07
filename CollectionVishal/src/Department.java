import java.util.ArrayList;
import java.util.List;

public class Department {
	
	public int deptID;
	public String deptName;
	public List<Employees> deptEmployees;

	public Department() {
		Employees a  = new Employees();
		a.empID = 1;
		a.empName = "Anurag";
		a.empSalary="$2500";
		
		List<Employees> as = new ArrayList<Employees>();
		as.add(a);
		Department sa = new Department();
		sa.deptEmployees = as;
		
				
	}
	
}
