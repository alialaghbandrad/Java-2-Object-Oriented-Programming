package company;

import java.util.ArrayList;
import java.util.List;

public class Company {
	
	public static void main(String[] args) {
		//provide dummy data
		//scanner
		//print 
		
		List<Employee> emplist = new ArrayList<Employee>();
		
		emplist.add(new SaleriedEmployee("Harry Potter", "123-333-444", 780));
		emplist.add(new CommissionEmployee("Peter Parker", "4444-666-777", 2345.5, 0.56));
		emplist.add(new HourlyEmployee("Joker", "3333-444-666", 564.5, 23.3));
		
		Payroll payroll = new Payroll(emplist);
		payroll.paySalary();
	}
}
