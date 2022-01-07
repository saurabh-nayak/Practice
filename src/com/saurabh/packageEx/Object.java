package com.saurabh.packageEx;
import java.lang.*;

//class can have name as String or any other pre-defined class name even Object is allowed.
//our created object class will extends predefined Object as fully qualified name as below.
/*no need to import classes and interfaces which is inside of java.lang package because
it included by default Exception, Error, Object, String, System, Runtime are inside lang package*/
public class Object extends java.lang.Object{

	
	
	void runThread()
	{
		Thread th1= new Thread() {
			@Override
			public void run() {
				System.out.println("In thread");
			}
		};
		th1.start();
}
}
