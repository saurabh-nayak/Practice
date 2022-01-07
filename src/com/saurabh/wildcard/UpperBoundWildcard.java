package com.saurabh.wildcard;

import java.util.ArrayList;
import java.util.List;

public class UpperBoundWildcard {
	//can accept values of Number and its subtype
	static void upper(List<? extends Number> list) {
		double sum=0.0d;
		
		for(Number obj:list) {
			
//			try {
			sum= sum+obj.doubleValue();
			
			/*
			 * cannot use parent type and child type both in multi catch block.
			 * will show compile time error that ArithmeticException already caught in Exception
			 * */
//			}catch (ArithmeticException | Exception  e) {
//				// TODO: handle exception
//			}
			
		}
		System.out.println("Sum is "+sum);
	}

	public static void main(String[] args) {  
		
		double f=10.5d;
		int i=(int)f;
		List<Integer> listInteger= new ArrayList();
		listInteger.add(10);
		listInteger.add(20);
		upper(listInteger);
		
		List<Number> listNumber= new ArrayList<Number>();
		listNumber.add(10.1);listNumber.add(20.1);
		upper(listNumber);
	}
}
