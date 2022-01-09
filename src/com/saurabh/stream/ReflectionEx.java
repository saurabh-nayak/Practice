package com.saurabh.stream;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

public class ReflectionEx {

	public static void main(String[] args) throws SecurityException, ClassNotFoundException {
		for(Method method:new Product().getClass().getDeclaredMethods())
		{
			System.out.println(method.getName());
			for(Parameter para: method.getParameters())
			{
				System.out.println(para.getName());
			}
		}

	}

}
