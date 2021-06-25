package company;

import java.util.ArrayList;
import java.util.List;

public class Payroll {
	private List<Employee> employees = new ArrayList<Employee>();
	
	public Payroll() {
//		employees.add(new SaleriedEmployee("Harry Potter", "123-333-444", 780));
//		employees.add(new CommissionEmployee("Peter Parker", "4444-666-777", 2345.5, 0.56));
//		employees.add(new HourlyEmployee("Joker", "3333-444-666", 564.5, 23.3));
	}
	
	public Payroll(List<Employee>  emplList) {
		this.employees = emplList;
	}
	
	public void paySalary() {
		for(Employee emp : employees) {
			System.out.println("the salary for " + emp + "is = " + emp.salary());
		}
	}
}
