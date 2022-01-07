package com.saurabh.polymorphism;
public class PlolymorphismAbstraction extends AbstractClass implements InterfaceI {
	public static void main(String arg[])
	{
		
		System.out.println(InterfaceI.i);
	}

	/*
	 * cannot reduce the visibility of inherited method
	 * error for ex, if we use default, protected or private modifier 
	 * when parent method having public modifier then we will get this error 
	 * 
	 * */

	@Override
 protected strictfp	void fun() {}

	/*method overriding happens by just method signatures like throws signature, function name,
	 * return type. access modifiers like public, protected can be different even we can include strictfp
	 * when in parent it is not declared 
	 * */
	
	@Override
	public strictfp void function() {}

	/*
	 * Example of covariant datatype in which we can use subclass type as
	 * return type in method overriding
	 * */
	
	@Override
	public PlolymorphismAbstraction add() {
		return null;
	}
	
	/*cannot override prvate methods*/
//	@Override
//	private void addition() {
//		
//	}

}
