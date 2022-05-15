package com.saurabh.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.saurabh.map.Employee;


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
	
	/*
	 * Comparator methods:--
	 * comparing method takes argument as function that can extract key from collection which we want to sort.
	 * another method of comparing takes 2 args 1 for extracting keys and 2nd for Comparator itself by which we want to sort collection.
	 * nullsFirst and nullsLast method behaves as per name give priority to null as per name.
	 * naturalOrder method uses default sorting of Comparable
	 * reversed method reverses the sorted elements
	 * comparingDouble, comparingInt methods takes ToDoubleFunction/ToIntFunction as arguments as sorting logic
	 * */
//	Comparator<Employee> depCompare=Comparator.comparing(Employee::getDepartment,Comparator.nullsFirst(String::compareTo));
	
	Comparator<Employee> depCompare=Comparator.comparingInt(Employee::getId).reversed();//comparingInt method takes single argument that from where need to extract keys
    
	//comparing method takes 2 args method to get keys and comparator
	Collections.sort(listEmployee, Comparator.comparing(Employee::getId, Comparator.reverseOrder()));
    
	Collections.sort(listEmployee,depCompare);
	for(Employee e: listEmployee)
	{
		System.out.println(e.getId()+" "+e.getName()+" "+e.getDepartment());
	}
}
	}
