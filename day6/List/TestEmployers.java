import com.Employers;
import com.EmployersDB;

public class TestEmployers {

	public static void main(String[] args) {
		EmployersDB empDb = new EmployersDB();
		
		Employers emp1 = new Employers(101, "Bob", "bob@w3epic.com", 'M', 25000);
		Employers emp2 = new Employers(102, "Alice", "alice@w3epic.com", 'F', 30000);
		Employers emp3 = new Employers(103, "John", "john@w3epic.com", 'M', 20000);
		Employers emp4 = new Employers(104, "Ram", "ram@w3epic.com", 'M', 50000);
		
		empDb.addEmployers(emp1);
		empDb.addEmployers(emp2);
		empDb.addEmployers(emp3);
		empDb.addEmployers(emp4);

		for (Employers emp : empDb.listAll())
			System.out.println(emp.GetEmployersDetails());
		
		System.out.println();
		empDb.deleteEmployers(102);
		
		for (Employers emp : empDb.listAll())
			System.out.println(emp.GetEmployersDetails());
		
		System.out.println();
		
		System.out.println(empDb.showPaySlip(103));
	}

}