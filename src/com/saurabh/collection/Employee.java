package com.saurabh.collection;

public class Employee implements Comparable<Employee>{
int id;

String name;
String department;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getDepartment() {
	return department;
}
public void setDepartment(String department) {
	this.department = department;
}
public Employee(int id, String name, String department) {
	super();
	this.id = id;
	this.name = name;
	this.department = department;
}
@Override
public int compareTo(Employee o) {
	return 1;
}



}