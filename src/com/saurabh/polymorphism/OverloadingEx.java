package com.saurabh.polymorphism;

public class OverloadingEx {

	static short a =10;
     int add(double a, float b) {
    	 System.out.println("in first method");
    	return  (int)(a+b);
    }
     double add(double a, int b) {
    	return a+b;
    }
	public static void main(String[] args) {

		new OverloadingEx().add(10, 20l);
	}

	
}
