package com.saurabh.collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;  
/* 
 * java.lang.UnsupportedOperationException on adding new entry in map after getting
 *  immutable object of map, set, list from of method
 * 
 */
public class CollectionMethods{
public static void main(String[] args) {
	//Map<Integer,String> map = Map.of(101,"saurabh",102,"sagar",103,"mehul");
	//map.put(104,"xyz");
//	Map.Entry m1 = Map.entry(101,"saurabh");
//	Map.Entry m2 = Map.entry(102,"jignesh");
//	Map<Integer,String> map = Map.ofEntries(m1,m2);
//	for(Map.Entry<Integer,String> mapEntry : map.entrySet()){
//		System.out.println(mapEntry);
//	}
	
	/*
	 * cannot invoke add method to list or any collection which created using of or copyOf method
	 * because it returns unmodifiable object of List12<> class which is static final inner class
	 *  of ImmutableCollections class in which it store object as @Stable which is same as final.
	 *  null values not allowed in List, Set or any Collection created using of method
	 * 
	 * */
	List<Integer> list=List.of(100,200);
//	list.add(10); //cannot invoke will throw UnsupportedOperationException
	System.out.println(list);
	List<Integer> list2=List.copyOf(list);
	System.out.println(list2);
//	list2.add(49); //cannot invoke will throw UnsupportedOperationException
	
	Set<Integer> set= Set.copyOf(list);
	System.out.println(set);
	
	/*
	 * of method in Map returns MapN<K,V> final class in which key and value both 
	 * will store in array of object which is declared @Stable means value of this 
	 * variable will be assigned only once and cannot be change after that.
	 * entry method of Map returns KeyValueHolder<K,V> object of reference Map.Entry
	 * 
	 * */
	Map.Entry<Integer, String> mapE1= Map.entry(101, "saurabh");
	/*
	 * java.lang.UnsupportedOperationException on setValue call of KeyValueHolder<K,V> throws this exception
	 * */
//	mapE1.setValue("nayak");
	Map.Entry<Integer, String> mapE2= Map.entry(102, "dhenier");
	Map<Integer, String> map= Map.ofEntries(mapE1, mapE2);
	System.out.println(map);
	
	/*
	 * getOrDefault method return value of that key or default given value
	 */
	System.out.println(map.getOrDefault(103, "No one"));
	
	/*
	 *null key or value not allowed in entry method of Map 
	 * */
//	Map.Entry<Integer, String> mapE3= Map.entry(null, null);
	
	/*
	 * null key or value not allowed in map created using of or ofEntries
	 * 
	 * */
//	Map<Integer, String> mapStr=Map.ofEntries(mapE3);
}
}