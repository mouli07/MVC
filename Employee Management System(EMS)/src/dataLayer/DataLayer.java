package dataLayer;

import java.util.ArrayList;
import java.util.List;

import employee.Employee;

public class DataLayer {
	
	List<Employee> emplList = new ArrayList<>();
	public void addEmployee(Employee employee) {
	emplList.add(employee);
	}
	public List<Employee> viewAllEmpl() {
	return emplList;
	}
	public Employee getEmpById(String ID) {
	for(Employee employee : emplList)
	{
	if(employee.getID().equals(ID))
		return employee;
	}
	return null;
	}
	public void deleteEmp(String ID) {
	for(Employee employee : emplList)
	{
	if(employee.getID().equals(ID))
	emplList.remove(employee);
	}
	}

}
