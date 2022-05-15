package com.saurabh.serialization;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializationEaxample implements Serializable {

	private static final long SerialVersionUID = 1l;
	private int id;
	private String name;
	private int marks;
	public SerializationEaxample(int id, String name, int marks) {
		this.id=id;
		this.name=name;
		this.marks= marks;
	}
	@Override
	public String toString() {
		return "SerializationEaxample [id=" + id + ", name=" + name + ", marks=" + marks + "]";
	}

	public static void main(String[] args) {

		SerializationEaxample se= new SerializationEaxample(101, "Saurabh", 100);
		try {
			FileOutputStream fos= new FileOutputStream("D://saurabh/ex.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(se);
			System.out.println("Success");
//			FileInputStream fis = new FileInputStream(new File("D://saurabh/ex.txt"));
//			ObjectInputStream ois = new ObjectInputStream(fis);
//			SerializationEaxample se2=(SerializationEaxample)ois.readObject();
//			System.out.println(se2);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} /*
			 * catch (ClassNotFoundException e) { // TODO Auto-generated catch block
			 * e.printStackTrace(); }
			 */
	}

}
