package com.saurabh.instanceOf;

public class Test {

	public static void main(String[] args) {
		A a=new B();  
		Call c=new Call();  
		c.invoke(a);  
	}

}
