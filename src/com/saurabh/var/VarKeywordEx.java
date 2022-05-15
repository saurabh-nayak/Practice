package com.saurabh.var;
import java.util.ArrayList;
import java.util.HashMap;

public class VarKeywordEx {

	/*
	 * var is not allowed as instance member variable
	 */
//	var i=10;
	
	/*
	 * var not allowed in function parameter and return type of function
	 */
//	void fun(var i) {
//		
//	}
	public static void main(String[] args) {
		
		//cannot use var as below in split between declaration and initialization.
		/*
		 * var j; j=100;
		 */
		
		//allowed as generic list 
		var<Integer> listInteger = new ArrayList<Integer>();
		listInteger.add(100);listInteger.add(200);
		
		//allowed in enhanced for loop
		for(var a: listInteger) {
			System.out.println("Integer list using var keyword "+a);
		}
		
		//allowed to store HashMap object also
		var<Integer,Integer> map= new HashMap<>();
		
		//allowed in lambda expression
		listInteger.stream().forEach((var i)->System.out.println(i));
		
		//allowed as local variable
		 var i=10;
		 fun(i);
	}

	private static void fun(int i) {

		System.out.println(i);
	}

}
