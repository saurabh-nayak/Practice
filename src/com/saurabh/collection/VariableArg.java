package com.saurabh.collection;
import java.util.ArrayList;
import java.util.List;

public class VariableArg {

	// The variable argument type int of the method fun must be the last parameter when we declare 2 vaargs
@SafeVarargs // This annotation is used to remove that warning of Heap pollution
	public static void fun(List<String>... products) {
		System.out.println("length of array "+products.length);
		for (int i = 0; i < products.length; i++) {
			for (String product : products[i]) {
				System.out.println(product);
			}
		}
	}

	public static void main(String[] args) {
		

		new VariableArg().fun();
		List<String> listString = new ArrayList<String>();
		List<String> listString1 = new ArrayList<String>();
		listString.add("saurabh");listString1.add("abc");listString.add("xyz");
		new VariableArg().fun(listString,listString1);
		List<String> listString2 = new ArrayList<String>();
		listString1.add("dfg");listString1.add("saurabh");listString.add("abc");listString2.add("xyz");
		new VariableArg().fun(listString,listString1,listString2);
	}

}
