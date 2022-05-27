package com.saurabh.annotation;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;


public class AnnotationEx {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException {
		Annot annot = new Annot();
		for(Method method:annot.getClass().getMethods())
		{
			System.out.println(method.getName());
			if(method.getName().equals("fun"))
			{
				for(Annotation annotation:method.getAnnotations())
				{
					if(annotation instanceof CustomAnnot)//can use instanceof operator with annotations
					{
						System.out.println("Got it");//will print Got it
					}
				}
			}
		}
//		System.out.println(annot.getClass().getMethod("fun",null).getAnnotation(CustomAnnot.class).value());
	}

}
