import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class EmployersDB {
	List<Employers> EmployersDb = new ArrayList<>();
	
	public boolean addEmployers(Employers e) {
		return EmployersDb.add(e);
	}
	
	public boolean deleteEmployers(int empId) {
		boolean isRemoved = false;
		
		Iterator<Employers> it = EmployersDb.iterator();
		
		while (it.hasNext()) {
			Employers emp = it.next();
			if (emp.getEmpId() == empId) {
				isRemoved = true;
				it.remove();
			}
		}
		
		return isRemoved;
	}
	
	public String showPaySlip(int empId) {
		String paySlip = "Invalid Employers id";
		
		for (Employers e : EmployersDb) {
			if (e.getEmpId() == empId) {
				paySlip = "Pay slip for Employers id " + empId + " is " +
						e.getEmpSalary();
			}
		}

		return paySlip;
	}
	
	public Employers[] listAll() {
		Employers[] empArray = new Employers[EmployersDb.size()];
		for (int i = 0; i < EmployersDb.size(); i++)
			empArray[i] = EmployersDb.get(i);
		return empArray;
	}
	
}