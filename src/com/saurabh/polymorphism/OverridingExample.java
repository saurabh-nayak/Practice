package com.saurabh.polymorphism;

public class OverridingExample extends PlolymorphismAbstraction {
	//static member variables also inherit as static member function
	static String str="OverridingExample";
	
//	public OverridingExample(String a) {
		//implicit super will be placed to call parent class constructor
		
		//If no args constructor not found in parent class then will get compile time error
		//PlolymorphismAbstraction() is undefined must explicitly invoke another constructor
//	}
//	public OverridingExample() {
//	}
	
	//Can have multiple instance initialization block executed top to bottom
	
//	the initializer block is used to declare/initialize the common part of various constructors of a class. 
//	It runs every time whenever the object is created. 
	{
		System.out.println("First");
	}
	//When JVM loads class static initialization block called and first super class static initialization block called 
	//child class static block called afterwards
	static{
		System.out.println("Second");
	}
	{
		System.out.println("Third");
	}
	public static void main(String args[]) {
//		new OverridingExample();
		//will get PlolymorphismAbstraction class str value
//		System.out.println(PlolymorphismAbstraction.str);
		//will get OverridingExample class str value
//		System.out.println(OverridingExample.str);
	}
	
}
