package com.saurabh.annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/*
 * 1)Cannot have any super type 
 * 2)Annotation type cannot have constructor
 * 2)methods cannot have implementation or return type
 * 3)method cannot have throws signature
 * 4)can declare with or without public access specifier
 * 
 */
@Target(ElementType.METHOD)
@interface CustomAnnot  {
	
	 int value() default 10;

}
