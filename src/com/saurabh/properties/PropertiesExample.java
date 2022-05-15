package com.saurabh.properties;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class PropertiesExample {

	public static void main(String[] args) throws IOException {

		Properties properties = new Properties();
		FileWriter writer= new FileWriter("example.properties");
		writer.write("name=saurabh");
		properties.store(writer, "Example prop");
	}

}
