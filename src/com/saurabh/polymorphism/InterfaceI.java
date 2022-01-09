package com.saurabh.polymorphism;

//can declare interface as strictfp but for any abstract method cannot use this
public strictfp interface InterfaceI {

	/*implicitly variable in interface is public static and final*/
	int i=10;
	
	//Implicitly in interface method is public and abstract
	 void function();
	 
	 /*
	  * can declare method as strictfp if that method is not abstract
	  * will give an error "strictfp is not permitted for abstract interface method function" 
	  * so cant use strictfp with abstract 
	  * also for variables and constructors we cant use strictfp
	  * strictfp void function();
	  *  
	  * */
	 default strictfp void imp() {
		 
	 }

//	 static private, default and public methods allowed in interface
	/*
	 * static private void fun() { }
	 * static void fun() {}
	 * public static void fun() {}
	 */
	 public static void fun() {}
	InterfaceI add() ;
}
