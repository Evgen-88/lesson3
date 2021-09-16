package com.itrexgroup.konoplyanik.task6.service;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.itrexgroup.konoplyanik.task6.model.Department;
import com.itrexgroup.konoplyanik.task6.model.Employee;

public class Task6ServiceTest {
	private List<Department> departments;
	
	@SuppressWarnings("serial")
	@Before
	public void presetDepartments() {
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
		List<Employee> employees1 = new ArrayList<>() {{
			add(william);
			add(sophia);
		}};
		dep1.setEmployees(employees1);
		
		Department dep2 = new Department();
		dep2.setName("dep-2");
		dep2.setCode("222-1");
		List<Employee> employees2 = new ArrayList<>();
		employees2.add(john);
		dep2.setEmployees(employees2);
		
		departments = new ArrayList<>() {{
			add(dep1);
			add(dep2);
		}};
	}
	
	@Test
	public void calcNumberOfEmployeesTest() {
		Assert.assertEquals(Task6Service.calcNumberOfEmployees(departments, 20000), 1);
	}
	
}
