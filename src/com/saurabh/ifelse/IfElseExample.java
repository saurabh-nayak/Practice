package com.saurabh.ifelse;

import java.io.File;


public class IfElseExample {

	public static void main(String[] args) {
		

		boolean a= false, b=false, c=false;
		
		//true assigned to a then next expressions will not execute because of ||
		if((a=true)|| (b=true) && (c=true))
		{
			System.out.println("In if block");
		}
		
		/*
		 * ans= true false false
		 * 
		 */
		System.out.println(a+" "+b+" "+c);
	
		//true assigned to a and b then next expression wil not execute because of || 
		//only 1 true is req in || condition so jvm will not check for next condition if we get true
		if((a=true) && (b=true) || (c=true))
		{
			System.out.println("In if block");
		}
		
		/*
		 * ans = true true false
		 */
		System.out.println(a+" "+b+" "+c);
	}

}
