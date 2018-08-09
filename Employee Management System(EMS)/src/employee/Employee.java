package employee;

public class Employee {
	
	String ID;
	String empName;
	double Salary;
	
	public String getID() {
	return ID;
	}
	public String getEmpName() {
	return empName;
	}
	public double getSalary() {
	return Salary;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public void setSalary(double salary) {
		Salary = salary;
	}

}
