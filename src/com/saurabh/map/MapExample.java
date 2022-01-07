package com.saurabh.map;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class MapExample {
	enum days{
		 Monday,Tuesday,Wednesay,Thursday,Friday,Saturday,Sunday;
	}

	public static void main(String[] args) {

		Map<Integer, Employee> empMap = new HashMap();
		
		/*
		 * put method always return previously attached value with that key
		 * returns null if no value previously attached to that key
		 * */
		
		System.out.println(empMap.put(101, new Employee(101, "saurabh", "java")));
//		System.out.println(empMap.put(101,  new Employee(103, "dhenier", "scott")));
		empMap.put(101, new Employee(101, "saurabh", "java"));
//		empMap.compute(101, (k,v)->(v==null)?new Employee(103, "bhojpuri", "commando"):empMap.get(101));
		
		/*
		 * can put one null as key and any number of null as value in HashMap
		 * cannot put a single null as key or value in HashTable
		 * empMap.put(null, null);
		 * Hashtable<Integer,Employee> hashTable= new Hashtable();
		   hashTable.put(null,new Employee(101, "saurabh", "java"));
		*/
		
		/*
		 * Collections.synchronizedList()
		 * Collections.synchronizedSet()
		 * Collections.synchronizedMap()
		 * these methods used to get synchronized list set map etc
		 * */
		
		/* Collections.unmodifiableList(listString) used to get list which is unmodifiable directly
		 * read and add operations only reflected from list reference passed to this method 
		 * This type of method available for hashmap, set, linked hash map etc also
		 * */
		
		List<String> listString = new ArrayList();
		listString.add("abc");
		System.out.println("listString: "+listString);
		List<String> ul = Collections.unmodifiableList(listString);
		System.out.println("unmodifible list: "+ul);
		listString.add("xyz");
		System.out.println("unmodifible list: "+ul);
		
		/*
		 * unmodifiable list cant add elements directly will throw UnSupportedOperationException
		 * 
		ul.add("vvv");
		*/
		
		/* computeIfAbsent method returns updated value if function evaluates else return old value whereas 
		 * putIfAbsent always return old value associated with that key
		 * computeIfAbsent takes 2 arguments 1 for key and second for Function 
		 * puIfAbsent takes 2 arguments key and value.
		 *  */
		
		System.out.println("Returned: "+empMap.computeIfAbsent(102, (k)->new Employee(102, "bhojpuri", "commando")));
		System.out.println("Returned: "+empMap.putIfAbsent(102,new Employee(102, "bhojpuri", "commando")));
		
		//computeIfPresent method accepts 2 args 1 for key and 2nd for BiFunction whch takes 2 args and returns type of value
		empMap.computeIfPresent(101, (k,v)->{if(v.department.equals("java")) {v.department="Node";}return v;});
		empMap.put(102, new Employee(102, "ab villiers", "php"));
		empMap.entrySet().stream().sorted(Map.Entry.comparingByKey()).collect(Collectors.toList()).forEach(System.out::println);
//		System.out.println("Name: "+empMap.get(101).name+"Department: "+empMap.get(101).department);
		
		/* EnumMap used for enum type key in map
		 * EnumSet used to get set from enum type
		 * */
		
		EnumMap<days, Employee> mapEnum = new EnumMap(days.class);
		mapEnum.put(days.Monday, null);
		for(Map.Entry<days,Employee> mapEntry:mapEnum.entrySet()) {
//			System.out.println("Enum: "+mapEntry.getKey()+" "+mapEntry.getValue());
		}
		
		/*LinkedList<String> llString = new LinkedList();
		 * linkedlist using static inner class Node<E> in which storing next and previous nodes in constructor
		 * 
		 * */
		
		List<String> stlist=Collections.singletonList("abc");
		Map<String,String> mapst=Collections.singletonMap("abc", "xyz");
		
		/*
		 * cannot add elements to a singleton list or map using add or put method
		 * stlist.add("xyz");
		 * mapst.put("bnb", "sbi");
		 * */
		System.out.println(stlist);
		
		/*TreeMap<String, String>
		 * 
		 * it uses static inner class Entry<k,v> in which its storing left, right and parent entry as Entry<k,v>
		 * by using comparator logic the new element will save in left/right/parent
		 * */
	}
	
}
