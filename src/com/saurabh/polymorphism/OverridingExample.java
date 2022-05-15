package com.saurabh.polymorphism;


public class OverridingExample extends PlolymorphismAbstraction {
	//static member variables also inherit as static member function
	 String str="OverridingExample";
	 static String parent="child";
	 String str2="OverridingExample";
	
//	public OverridingExample(String a) {
		//implicit super will be placed to call parent class constructor
		
		//If no args constructor not found in parent class and we haven't written super keyword then will get compile time error
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
	@Override
	 protected strictfp	void fun() {
		 System.out.println("In fun of child");
	 }
	public static void main(String args[]) {
//		new OverridingExample();
		//will get PlolymorphismAbstraction class str value
//		System.out.println(PlolymorphismAbstraction.str);
		//will get OverridingExample class str value
//		System.out.println(OverridingExample.str);

		//Cannot access child class elements if we have put child class object into parent class reference
		PlolymorphismAbstraction poli=new OverridingExample();
		//it will call child class fun method
		poli.fun();
		System.out.println(poli.str);//It will print str of parent class because variables cant be override
		System.out.println(PlolymorphismAbstraction.parent);//parent will be printed
		System.out.println(OverridingExample.parent);//child will be printed
		
		//If we create object and call static member variable then it will call variable of reference type
		PlolymorphismAbstraction oe=new OverridingExample();
		System.out.println(oe.parent);//parent will be printed
		
		//static member function and static member variables both are inherited
		System.out.println(new OverridingExample().i);
	}
	
}
