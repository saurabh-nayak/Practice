package com.saurabh.string;
@FunctionalInterface
public interface Functional {
	void add();
	
	/*default method cannot override a method of Object class*/
//	 default boolean equals(Object obj) {
//		 
//	 }
	
//	static and private methods allowed in interface
	/*
	 * private static void fun() { System.out.println(); }
	 * 
	 * private void fun() { System.out.println(); }
	 */
}
