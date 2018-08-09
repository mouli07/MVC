package serviceLayer;

import java.util.List;

import dataLayer.DataLayer;
import employee.Employee;

public class ServiceLayer {
	
	DataLayer empD;
	public void addEmployee(Employee employee) {
	empD.addEmployee(employee);
	}
	public List<Employee> viewAllEmpl() {
	return empD.viewAllEmpl();
	}
	public Employee getEmpById(String ID) {
	return empD.getEmpById(ID);
	}
	public void deleteEmp(String ID) {
	empD.deleteEmp(ID);
	}

}
