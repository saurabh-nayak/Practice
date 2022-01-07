package com.saurabh.file;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.io.Writer;

public class FileEx {
	static String str="Grow up kids!";
	public static void main(String[] args) {
		
		File file = new File("D:\\file1.txt");
		if(!file.exists()) {
			try {
				boolean created=file.createNewFile();
				System.out.println(created+" File is created");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}else {
			System.out.println("file already exists");
		}
		
		/*
		 *OutputStream uses bytes array to write and read from source
		 * */
		
//		try(OutputStream oStream=new FileOutputStream(file,true);) {
//			oStream.write(str.getBytes());
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
		
		/*
		 * InputStream uses bytes to read data from source
		 *  uses byte stream 
		 * */
		try(InputStream iStream = new FileInputStream(file);){
			
			/*
			 * transferTo method reads bytes from the stream and writes to outputStream
			 * iStream.transferTo(outputStream);
			 */
			
			/*
			 * returns anonymous class of InputStream InputStream
			 * i=iStream.nullInputStream();
			 */
			
			//it reads all bytes of stream
			//read(byte[]) method reads from stream and write into byte array
		for(byte b:iStream.readAllBytes()) {
			System.out.print((char)b);
		}
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		/*
		 * using Writer we can directly write or read string from source.
		 * it uses Character stream.
		 * transferTo(OutputStream) method writes all the characters readed from stream to specified OutputStream.
		 * 
		 * */
		
		try(Writer writer= new FileWriter("D:\\file2.txt");
			Reader reader= new FileReader("D:\\\\file2.txt");	) {
			writer.write(str);writer.flush();int i=-1;
			System.out.println("from FileReader");
			do {
				//reads byte of character
				//read(char[]) method reads from stream and write into char array
				i=reader.read();
				System.out.print((char)i);
			}while(i!=-1);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		/*
		 * BufferedWriter used to provide buffering feature to Writer.
		 * it also uses character stream.
		 */
		try(Writer bWriter = new BufferedWriter(new FileWriter("D:\\\\file2.txt", true));
				BufferedReader reader= new BufferedReader(new FileReader(new File("D:\\\\\file2.txt")))){
			bWriter.write(str);
			bWriter.flush();
			System.out.println("from BufferedWriter");
			
			//readLine method read whole line and return string;
			System.out.println(reader.readLine());
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		try(BufferedInputStream biStream =new BufferedInputStream(new FileInputStream(new File("D:\\\\file2.txt")));){
			System.out.println("From BufferedInputStream");
			for(byte b:biStream.readAllBytes()) {
				System.out.print((char)b);
			}
		}catch(IOException e) {
			e.printStackTrace();}
	}		
	}

