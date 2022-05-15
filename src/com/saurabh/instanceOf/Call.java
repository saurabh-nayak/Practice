package com.saurabh.instanceOf;

public class Call {
	
	void invoke(A p){//upcasting  
		if(p instanceof Printable){  
		A a=(A)p;//Downcasting   
		a.a();  
		}  
		if(p instanceof A){  
		B b=(B)p;//Downcasting   
		b.b();  
		}  
		  
		}  

}
