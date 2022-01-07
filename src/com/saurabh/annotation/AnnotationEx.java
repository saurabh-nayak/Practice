package com.saurabh.annotation;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;


public class AnnotationEx {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException {
		Annot annot = new Annot();
		System.out.println(annot.getClass().getMethod("fun",null).getAnnotation(CustomAnnot.class).value());
	}

}
