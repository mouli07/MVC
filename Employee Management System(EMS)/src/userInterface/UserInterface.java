package userInterface;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import controller.Controller;
import employee.Employee;

public class UserInterface {

	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	Controller ctrlClss;
	
	public void setCtrl(Controller ctrlClss) {
	this.ctrlClss = ctrlClss;
	}
	
	public void start() throws NumberFormatException, IOException {
	ApplicationContext context = new ClassPathXmlApplicationContext("context1.xml");
	Controller ctrlClss = (Controller) context.getBean("controller");
	setCtrl(ctrlClss);
	menu();
	}
	
	public void menu() throws IOException {
	int choice = 0;
	while(choice!=5) {
	System.out.println("Menu ::");
	System.out.println("1. Add Employee\n2. View All Employees\n3.Get Employee Informations\n4. Delete Employee \n5.Exit");
	System.out.print("Enter The Menu Item :: ");
	choice = Integer.parseInt(in.readLine());
	String id;
	switch (choice) {
	
	
	case 1:
	System.out.print("Enter The Employee ID :: ");	
	id = in.readLine();
	System.out.print("Enter The Employee Name :: ");	
	String name = in.readLine();
	System.out.print("Enter The Employee Salary :: ");	
	double salary = Double.parseDouble(in.readLine());
	Employee empl = new Employee();
	empl.setEmpName(name);
	empl.setID(id);
	empl.setSalary(salary);
	//acceptData();
	break;
	
	case 2:
		display(ctrlClss.viewAllEmpl());
	ctrlClss.viewAllEmpl().stream().forEach(System.out::println);
	//displayData();
	break;
	
	case 3:
	//id = getId();
	System.out.print("Enter The Employee ID :: ");	
	id = in.readLine();
	System.out.println(ctrlClss.getEmpById(id));
	break;
	
	case 4:
	//id = getId();
	System.out.print("Enter The Employee ID :: ");	
	id = in.readLine();
	ctrlClss.deleteEmp(id);
	break;
	
	default:
	System.out.println("Wrong Choice");
	break;
	}
	}
	}
	
	public void display(List<Employee> viewAllEmpl)
	{
		List<Employee> list=new ArrayList<>();
		list.stream().forEach((element)->System.out.println(list));
	}
}
