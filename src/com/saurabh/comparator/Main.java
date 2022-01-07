package com.saurabh.comparator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
	
	
   /*
    * ClassCastException if list elements not implementing Comparable interface
    * cannnot cast to Comparable
    * */
	public static void main(String[] args) {
		List listEmployee = new ArrayList();
		listEmployee.add(new Employee(101, "saurabh", "java"));
		listEmployee.add(new Employee(107, "andrews", "Big data"));
        Collections.sort(listEmployee);
        System.out.println(listEmployee);
	}

}
