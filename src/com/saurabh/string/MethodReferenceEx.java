package com.saurabh.string;
import java.util.Comparator;
import java.util.Scanner;
import java.util.function.BiFunction;
import java.util.function.Function;

//Method reference example
public class MethodReferenceEx {

	MethodReferenceEx() {
		System.out.println("constructor called");
	}

	public static void test() {
		System.out.println("called static method");
	}

	public void fun() {
		System.out.println("instance method called");
	}

	public static StringBuilder function(String str) {
		StringBuilder sBuilder = new StringBuilder(str);
		sBuilder.append(" is smart man");
		return sBuilder;
	}

	public static StringBuilder function(String str1, String str2) {
		StringBuilder sBuilder = new StringBuilder(str1);
		return sBuilder.append(" and " + str2 + " are engaged");

	}

	public static void main(String[] args) {

		Functional fun = MethodReferenceEx::test;// static method reference
		fun.add();
		Functional f = new MethodReferenceEx()::fun;// instance method reference
		f.add();
		Functional f1 = MethodReferenceEx::new;// constructor reference
		f1.add();

		// inbuilt Function type as functional interface used as method reference
		Function<String, StringBuilder> fun1 = MethodReferenceEx::function;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name who is handsome ");
		System.out.println(fun1.apply(sc.nextLine()));

		BiFunction<String, String, StringBuilder> bFunction = MethodReferenceEx::function;
		System.out.println("Enter name of groom and bride going to engage");
		System.out.println(bFunction.apply(sc.nextLine(), sc.nextLine()));
		sc.close();

		/* Runnable is functional interface so used method reference to attach code to the thread
		 * We can use lambda function and method reference both to provide implementation to functional interface
		 */
		
		Thread th = new Thread(MethodReferenceEx::new);
		th.start();

	}
}
