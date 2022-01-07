package com.saurabh.string;
import java.util.List;
import java.util.StringJoiner;

public class StringExample {

	public static void main(String[] args) {
      String s1= "abc";
      String s2= "abc";
      
      /*
       * intern method add the string in string pool if its not added in string pool till
       * otherwise it will return the reference of the object previously created in string pool.
       * */
      String s3 = new String("abc").intern();
      String s4 = new String("abc").intern();
      System.out.println(String.format("s1 and s2 are equal %b",s1==s2));
      System.out.println(String.format("s2 and s3 are equal %b",s2==s3));
      System.out.println(String.format("s1 and s3 are equal %b",s1==s3));
      System.out.println(String.format("s3 and s4 are equal %b",s4==s3));

      /*dont know this behaviour*/
      System.out.println("Name is "+s3==s4);
      System.out.println("abc is string "+true);
      /*
       * hashcode of both s1, s2, s3 and s4 are same
       *  */
      System.out.println("hash of s1: "+s1.hashCode());
      System.out.println("hash of s2: "+s2.hashCode());
      System.out.println("hash of s3: "+s3.hashCode());
      System.out.println("hash of s4: "+s4.hashCode());
      
      //null delimiter is not allowed it will throw null pointer but elemnets can be null treated as a string
      System.out.println(String.join("-", null,"goni",null));
      System.out.println(String.join(",",List.of("abc","xyz","pqr","bcd")));
      
      //StringJoiner with delimiter
      StringJoiner sj = new StringJoiner("/","^","~");
      sj.setEmptyValue("Thats empty");
      System.out.println("sj empty "+sj);
      sj.add("10");sj.add("11");sj.add("12");
      System.out.println(sj);
     
      //StringJoiner with delimiter, prefix and suffix
      StringJoiner sj2= new StringJoiner("$","/","-");
      sj2.add("saurabh");sj2.add("sagar");sj2.add("alpesh");sj2.add("andrews");
     
      //after calling add method no meaning to set EmptyValue but it will not throw any error or exception
      sj.setEmptyValue("Thats empty");
      
      //merge StringJoiner
      sj2.merge(sj);
      sj.merge(sj2);
      System.out.println("sj "+sj);
      System.out.println("sj2 "+sj2);
      
      //format method of String in java %d for digits %f for floating point %s for any
      System.out.println(String.format("i am %d",21).concat(" years old"));
      
      /*
       * trim method removes leading and trailing whitespaces
         returns same object if whitespaces are absent
      */
      String str="Hello Javascript";
      String str2= "Hello Javascript";
      System.out.println(str.hashCode());
      System.out.println(str.trim().hashCode());
      System.out.println(str.trim()==str);
    		}

}
