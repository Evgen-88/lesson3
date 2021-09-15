package com.itrexgroup.konoplyanik.task6.service;

import java.util.List;

import com.itrexgroup.konoplyanik.task6.model.Department;

public class Task6Service {
	
	public static long calcNumberOfEmployees(List<Department> departments, long threshold) {
        return departments.stream().filter(d -> d.getCode().startsWith("111-"))
        		.flatMap(d -> d.getEmployees().stream())
        		.filter(e -> e.getSalary() >= threshold).count();
    }

}
