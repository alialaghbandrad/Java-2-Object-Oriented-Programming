package company;

import java.util.ArrayList;
import java.util.List;

public class Company {
	
	public static void main(String[] args) {
		
		List<Employee> emplist = new ArrayList<Employee>();
		
		emplist.add(new SaleriedEmployee("John Hopkins", "222999652", 340));
		emplist.add(new CommissionEmployee("Erik Snowdon", "644001823", 166.7, 0.72));
		emplist.add(new HourlyEmployee("Joker", "3333-444-666", 423.9, 20.6));
		
		Payroll payroll = new Payroll(emplist);
		payroll.paySalary();
	}
}