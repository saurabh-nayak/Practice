package com.saurabh.serialization;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Main {

	public static void main(String[] args) {

//		java.io.InvalidClassException: if we make change in class by which serialization took place then this exception will come
		try {
			FileInputStream fis = new FileInputStream(new File("D://saurabh/ex.txt"));
			ObjectInputStream ois = new ObjectInputStream(fis);
			SerializationEaxample se2=(SerializationEaxample)ois.readObject();
			System.out.println(se2);
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
