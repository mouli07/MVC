package controller;

import java.util.List;

import employee.Employee;
import serviceLayer.ServiceLayer;

public class Controller {
	
	ServiceLayer emplsl;
	public void addEmployee(Employee employee) {
	emplsl.addEmployee(employee);
	}
	public List<Employee> viewAllEmpl() {
	return emplsl.viewAllEmpl();
	}
	public Employee getEmpById(String ID) {
	return emplsl.getEmpById(ID);
	}
	public void deleteEmp(String ID) {
	emplsl.deleteEmp(ID);
	}

}
