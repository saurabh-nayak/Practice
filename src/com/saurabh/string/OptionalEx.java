package com.saurabh.string;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class OptionalEx {

	public static void main(String[] args) {
		//isPresent method
		String str1="";String str2=null;String str3="thats a string";
		
		Optional<String> optStr1=Optional.ofNullable(str1);
		if(optStr1.isPresent()) { System.out.println("opstring1"+optStr1.get());}
		
		Optional<String> optStr2=Optional.ofNullable(str2);
		if(optStr2.isPresent()) { System.out.println("opstring2"+optStr2.get());}
		
		Optional<String> optStr3=Optional.ofNullable(str3);
		if(optStr3.isPresent()) { System.out.println("opstring3"+optStr3.get());}
		
		//using stream with optional to filter out values and print if its present
		List<String> listString = new ArrayList<>();
		listString.add("abc");listString.add("xyz");listString.add("mno");listString.add("pqr");
		Optional<List<String>> optListString=Optional.ofNullable(listString);
		optListString.ifPresent(ls->{ls.stream().filter(l->l.equals("mno")|| l.equals("xvc")).forEach(System.out::println);});
		
	    
	    
	    /*
	     * of method throws NulPointerException if given null.
	     * empty method returns empty Optional.
	     * get method throws NoSuchElementException if element is not present in Optional.
	     * filter method apply given predicate and returns Optional of type otherwise empty Optional.
	     * ifPresent method accepts a Consumer executed if element present in Optional.
	     * ifPresentOrElse method accepts a Consumer and Runnable if elements present then execute Consumer
	     * or else execute Runnable.
	     * isPresent returns true if value present whereas isEmpty returns true when its empty.
	     *  
	     * */
		Optional<Integer> opt= Optional.empty();
//	    opt.get();
	    opt.filter(i->(i<200)).ifPresentOrElse(System.out::println,()->System.out.println("No elements") );;
	   System.out.println("isPresent method: "+opt.isPresent());
	   System.out.println("isEmpty method: "+opt.isEmpty());
	  
       
	   /*
	    * or method returns Optional of element or returns Optional of element generated from given Supplier. 
        * orElseThrow method throws NoSuchElementsException if Optional don't have any element.
        * orElse return given value Integer
        * orElseGet accepts Consumer which returns T type.
        * orElseThrow accepts Supplier which supply exception
        * */
	   opt.or(()-> Optional.of(100)).ifPresentOrElse(System.out::println,()->System.out.println("No elements") );;
	   System.out.println("orElse "+opt.orElse(500));
	   opt.orElseGet(()->700);
	   opt.orElseThrow(()->new ArithmeticException());
	   //	   opt.orElseThrow();
	   
	}

}
