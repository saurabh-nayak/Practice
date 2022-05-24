package com.saurabh.exception;


public class Main {

	public static void main(String[] args) {

		int a=100;
		int b=200;
		if(a-b<0)
		{
			//unchecked exception no need to handle it
			throw new UnCheckedException("Negative result");
			
			//checked exception need to handle it using try catch or throws
//			try {
//				throw new CheckedException("Negative result");
//			} catch (CheckedException e) {
//				e.printStackTrace();
//			}
			
		}
		//whenever user defined catch executed remaining line will be executed otherwise not
		System.out.println("Line after exception");
		
	}

}
