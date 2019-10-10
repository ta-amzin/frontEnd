package controller;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

import model.Employee;
import service.EmployeeEJB;

@ManagedBean(name ="employeecontroller")
@SessionScoped
public class EmployeeController {

	@EJB
	EmployeeEJB employeeservice;
	@ManagedProperty(value="#{employee}") 
	private Employee employee;
	
	
	public void addNewEmployee() {
		
		System.out.println("Test LL");
		employeeservice.addNew(employee.getEntity());
	}

		public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	


}
