package com.saurabh.innerclass;
import java.io.IOException;

//implementation of nested interface inside class
public class NestedInterfaceFromClass implements OuterInterfaceImpl.i1{

	@Override
	public void abc() {
    System.out.println("abc called from nested interface declared in class");	
    
    /*
     * checked exceptions cannot be propagated in call stack
     * need to be handled with try catch or throws
     * 
    throw new IOException();*/
    
    /*
     * unchecked exceptions can be propagated 
     * no need to handle with try catch or throws
		throw new ArithmeticException();
		*/
    
	}
	

}
