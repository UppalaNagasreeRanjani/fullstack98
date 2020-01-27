package com.Day14;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ApiMethods {
public static void main(String[] args) {
	List<Employee> name=new ArrayList<Employee>();
	addEmployee(name);
	name.forEach(System.out::println);
	//emp age less than 22
	List<Employee> ageScale=name.stream().filter(emp->emp.getAge()<22  ).collect(Collectors.toList());
	//System.out.println("age less than 22");
	
	ageScale.forEach(System.out::println);
	//length greater than 5
	List<Employee> nameScale=name.stream().filter(emp->emp.getName().length()>5).collect(Collectors.toList());
	nameScale.forEach(System.out::println);
	//increase sal by 10 persent
	List<Double> salEmployee=name.stream().map(emp->emp.getSalary()+(emp.getSalary()/10)).collect(Collectors.toList());
	System.out.print("after incrementing");
	salEmployee.forEach(System.out::println);
//another way for incrementing
List<Employee> salEmployee1=name.stream().map(emp->
{
	emp.setSalary(emp.getSalary()*1.1);
	return emp;
	
})
.collect(Collectors.toList());
System.out.print("after incrementing");
salEmployee1.forEach(System.out::println);

}
private static void addEmployee(List<Employee> employee) {
	
	Employee emp1 = new Employee(101, "Abinsri", "Hydrabad", 22, 6678687687L, 67);
	Employee emp2 = new Employee(102, "Anu", "Chennai", 21, 345354354L, 45);
	employee.add(emp1);
	employee.add(emp2);
	
}
}
