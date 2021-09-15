package com.itrexgroup.konoplyanik.task6;

import java.util.ArrayList;
import java.util.List;

import com.itrexgroup.konoplyanik.task6.model.Department;
import com.itrexgroup.konoplyanik.task6.model.Employee;
import com.itrexgroup.konoplyanik.task6.service.Task6Service;

public class Task6Application {
	
	public static void main(String[] args) {
		Employee william = new Employee();
		william.setName("William");
		william.setSalary(20000);
		
		Employee sophia = new Employee();
		sophia.setName("Sophia");
		sophia.setSalary(10000);
		
		Employee john = new Employee();
		john.setName("John");
		john.setSalary(50000);
		
		Department dep1 = new Department();
		dep1.setName("dep-1");
		dep1.setCode("111-1");
		List<Employee> employees1 = new ArrayList<>();
		employees1.add(william);
		employees1.add(sophia);
		dep1.setEmployees(employees1);
		
		Department dep2 = new Department();
		dep2.setName("dep-2");
		dep2.setCode("222-1");
		List<Employee> employees2 = new ArrayList<>();
		employees2.add(john);
		dep2.setEmployees(employees2);
		
		List<Department> departments = new ArrayList<>(2);
		departments.add(dep1);
		departments.add(dep2);
		
		System.out.println(Task6Service.calcNumberOfEmployees(departments, 20000));

	}

}
