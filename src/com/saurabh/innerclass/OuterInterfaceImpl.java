package com.saurabh.innerclass;

//nested interface implementation
public class OuterInterfaceImpl implements OuterInterface.InnerInterface{

	@Override
	public void msg() {
		System.out.println("abc");
		
	}
	
	//nested interface inside class
static interface i1{
	default void fun() {
		System.out.println("fun called from nested interface from class.");
	}
	void abc();
}
}
