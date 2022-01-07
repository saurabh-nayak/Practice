package com.saurabh.collection;
public class UnderscoreSupport{
public static void main(String[] args)
{
	//from java 9 onwards _ cannot be used as variable name because from Java 9 its a keyword
//int _ = 10;
  //System.out.println(_);
  Runtime.Version bersion = Runtime.version();
  System.out.println(bersion);
  System.out.println(bersion.pre());
}
}