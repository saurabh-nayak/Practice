package com.saurabh.annotation;
public class Annot{
	@CustomAnnot(value=50)
	public void fun() {
		System.out.println("Hello world with anntation");
	}
}
