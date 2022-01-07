package com.saurabh.map;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;


public class ComparatorEx {

	public static void main(String[] args) {
	List<Employee> listEmployee = new ArrayList();
	listEmployee.add(new Employee(101,"saurabh","c"));
	listEmployee.add(new Employee(103, "parth","d"));
	listEmployee.add(new Employee(102, "harsh", "b"));
	listEmployee.add(new Employee(104, "anjana", null));
	listEmployee.add(new Employee(105, "modi", null));
	listEmployee.add(new Employee(106, "parth","d"));
	listEmployee.add(new Employee(109, "harsh", "p"));
//	Comparator<Employee> depCompare=Comparator.comparing(Employee::getDepartment,Comparator.nullsFirst(String::compareTo));
	Comparator<Employee> depCompare=Comparator.comparingInt(Employee::getId).reversed();
    Collections.sort(listEmployee);
    Collections.sort(listEmployee,depCompare);
	for(Employee e: listEmployee)
	{
		System.out.println(e.getId()+" "+e.getName()+" "+e.getDepartment());
	}
}
	}
