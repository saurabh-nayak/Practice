package com.saurabh.packageEx;




public class PackageEx {

	public static void main(String[] args) {
		//fully qualified name is required when String class is in our package.
		java.lang.String str="abc";
		int i='z';
		System.out.println(i);
		Object obj= new Object();
		obj.runThread();
		System.out.println(obj.toString());
	}

}
