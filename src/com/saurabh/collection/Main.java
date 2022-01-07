package com.saurabh.collection;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Vector;

public class Main {

	public static void main(String[] args) {
		ArrayList<String> al= new ArrayList();
		al.add("saurabh");al.add("sagar");al.add("jacquline");
		al.add("aryan nasedi");
		al.stream().forEach(System.out::println);
		Iterator<String> is=al.iterator();
		while(is.hasNext()) {
			System.out.println(is.next());is.remove();}
	    Vector<String> vc = new Vector<>();
	    vc.add("abc");vc.add("xyz");vc.add("pqr");
	    Enumeration<String> ec = vc.elements();
//	    while(ec.hasMoreElements())
//	    {System.out.println(ec.nextElement());}
	    Iterator<String> isd=ec.asIterator();
	    while(isd.hasNext()) {
			System.out.println(isd.next());}
	    Set<Employee> set= new TreeSet(new EmployeeComparator());
	    set.add(new Employee(101,"saurabh","java"));
	    set.add(new Employee(102,"govind","react"));
	    set.add(new Employee(103,"sagar","php"));
	    set.add(new Employee(104,"sagar","angular"));
	    set.add(new Employee(105,"daniel","react"));
	    set.add(new Employee(106,"derek","java"));
	    set.forEach((a)->{System.out.println("Id: "+a.getId()+" Name: "+a.getName()+" Department: "+a.getDepartment());});
	    Set<String> set2= new HashSet();
	    set2.add("abc");set2.add("kyc");
	    set2.add(null);
//	    Spliterator<String> si=set2.spliterator();
//	    System.out.println("Immutable "+si.IMMUTABLE);
//	    System.out.println(si.estimateSize());
//	    Spliterator<String> si2= si.trySplit();
//	    System.out.println("characteristics "+si2.hasCharacteristics(si2.characteristics()));
//	    System.out.println(si2.estimateSize());
	    System.out.println(set2);
	    set2.remove(null);
	    System.out.println(set2);
	    LinkedList<String> ll = new LinkedList<>();
	    ll.add("saurabh");
	    ll.add("maya");
	    System.out.println(ll.get(1));
	    
	    //TreeMap uses comparator to sort key of map
	    Map<Employee,String> map= new TreeMap(new EmployeeComparator());
	    map.put(new Employee(103,"sagar","aa"), "andrew");
	    map.put(new Employee(103,"sagar","bb"), "sady");
	    map.put(new Employee(101,"saurabh","java"),"smart");map.put(new Employee(102,"govind","react"),"dumb");
	    map.put(new Employee(103,"sagar","php"), "common");
//	    System.out.println("value "+map.get("ket"));
	    System.out.println("Map: "+map);

	    List<Employee> listEmployee = new ArrayList();
		listEmployee.add(new Employee(101,"saurabh","c"));
		listEmployee.add(new Employee(103, "parth","d"));
		listEmployee.add(new Employee(102, "harsh", "b"));
		listEmployee.add(new Employee(104, "anjana", null));
		listEmployee.add(new Employee(105, "modi", null));
		listEmployee.add(new Employee(106, "parth","d"));
		listEmployee.add(new Employee(109, "harsh", "p"));
		Collections.sort(listEmployee);
	}

}
