package com.saurabh.conversion;

public class Conversion {

	public static void main(String[] args) {

		int a='a';//char to int widening conversion
		double dou='a';float f='a';//widening conversions
		
		byte s=10; //int 10 is within the range of byte so allowed.
		
		byte bite='b';//char widened to int and narrowed to byte so ok as per udemy
		
		short b=s;//widening conversion byte to short
		
		short s2= 20;
		/* byte b2= s2; */ //narrowing conversion not allowed implicitly
		byte b2=(byte)s2; //allowed explicit narrowing conversion
		
		int j=10;
		/* Double d=j; */ // narrowing or widening will not work with Wrapper classes.

		Character ch='a';
		int m= ch;   //Widening conversion work
		/* Integer m= ch; */   //not work because of Wrapper.
		
		//cannot convert from char to short or short to char.
//		char x= 'x';
//		short shor=x;

	}
	

}
