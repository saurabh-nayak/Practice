package com.saurabh.swich;

public class SwitchEx {
	
	static enum Days{
		SUNDAY,TUESDAY,WEDNESDAY, THURSDAY,FRIDAY,SATURDAY;
	}

	public static void main(String[] args) {

		char ch='b';
		String str="a";
		
		//char in switch
		switch(ch) {
		case 'a':
			System.out.println("A");
			break;
		//break statement is missing for case b so subsequent sop statement also will be execute
		case 'b':
			System.out.println("B");
		case 'c':
			System.out.println("C");
		default:
			System.out.println("Default");
		}
		
		//String in switch statement
		switch(str) {
		case "a":
			System.out.println("String A");
		case "b":
			System.out.println("String B");
		default:
			System.out.println("Default");
		}
		
		//enum in switch statement
		for(Days d:Days.values()){
			switch(d) {
			case SUNDAY:
				System.out.println("Sunday");
			case TUESDAY:
				System.out.println("Tuesday");
		}
		}
		
		//float, long, boolean, double, object type values not alowed in switch
		//Wrapper Integer is allowed
		  Integer l= 10; 
		  switch(l) {
		  
		  }
		  /*
		   * "cannot swith on value type of float"
		   * will get this error when will try to use float value in switch statement
		   */
//		 float i=5;
//		 switch(i) {
//		 case 5:
//		 }
//		  Float f=1.1f;
//		  switch(f) {
//		  
//		  }
		  
		  /*
		   * int allowed in switch statement
		   */
//			 int i=5;
//			 switch(i) {
//			 case 5:
//			 }
	}

}
