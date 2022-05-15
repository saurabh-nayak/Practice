package com.saurabh.wildcard;
import java.util.Arrays;  
import java.util.List; 

//static imports by this can use static elements of System class directly without System class
import static java.lang.System.*;
  
public class LowerBoundWildcard {  
  
	//underscore support in numericals only allowed between 2 digits to improve readibility.
	static int a=1_______000;
	//can accept numbers of type Integer and its super type
    public static void addNumbers( List<? super Integer> list) {  
  
        for(Object n:list)  
        {  
              out.println(n);  
          
        }      
        System.out.println(a);
    }  
    

public static void main(String[] args) {  
      
    List<Integer> l1=Arrays.asList(1,2,3);  
      out.println("displaying the Integer values");  
    addNumbers(l1);  
      
    List<Number> l2=Arrays.asList(1.0,2.0,3.0);  
      System.out.println("displaying the Number values");  
    addNumbers(l2);  
}  
  
}  