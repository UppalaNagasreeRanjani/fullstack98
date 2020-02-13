package com.cts.training.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cts.training.dao.EmployeeDAO;
import com.cts.training.model.Employee;

public class EmployeeController {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("./beans.xml");
		EmployeeDAO employeeDAO = (EmployeeDAO) context.getBean("employeeDAOImpl");
		
		//insertion
		Employee employee=new Employee(3,"nagasri",8898678976l,"nagasri@gmail.com");
		
		//System.out.println(employeeDAO.saveEmployee(employee));
		//System.out.println(employeeDAO.getAllEmployees());
		//deletion
//		Employee delete = employeeDAO.getEmployeeById(3);
//		boolean status1 = employeeDAO.deleteEmployee(delete);
//		if (status1) {
//			System.out.println("employee deleted Successfully");
//		} else {
//			System.out.println("Try Again");
//		}
		// update
		Employee update = employeeDAO.getEmployeeById(1);
		update.setEmail("uppalaranjani98@gmail.com");
		boolean status2 = employeeDAO.updateEmployee(update);
		if (status2) {
			System.out.println("employee updated Successfully");
		} else {
			System.out.println("Try Again");
		}
	}
	

}
