package emp.org;

import org.com.Company;
import org.com.EmployeeDetails;

public class Details {
	public void name() {
		System.out.println("name:guna");	
	}
public void id() {
	System.out.println("id :1002");
	
}
public static void main(String[] args) {
	Details d=new Details();
	d.name();
	d.id();
	Company c = new Company();
	c.comdetails();
	c.comid();
	EmployeeDetails e = new EmployeeDetails();
	e.employeeName();
	e.employeeId();

}
}
