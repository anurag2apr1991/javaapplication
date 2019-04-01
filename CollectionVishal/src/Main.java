import java.awt.List;
import java.util.ArrayList;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Department d1 = new Department();
		d1.setDeptID(1);
		d1.setDeptName("Eco");
		ArrayList<Employees> L1 = new ArrayList<Employees>();
		L1.add(new Employees());
		
		d1.setDeptEmployees(L1);
		
		
	}

}
