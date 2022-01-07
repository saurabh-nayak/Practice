package com.saurabh.annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/*
 * 1)Cannot have any super type 
 * 2)Annotation type cannot have constructor
 * 2)methods cannot have implementation or return type
 * 3)method cannot have throws signature
 * 
 */
@Target(ElementType.METHOD)
public @interface CustomAnnot  {
	
	public int value() default 10;

}
