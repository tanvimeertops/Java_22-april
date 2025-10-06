package com.fileIO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * File :to store the data permanently
 * file is a class
 * stream : source in which data is stored
 * 1. Byte Stream:  1 byte
 * 		file write:
 * 			FileOutputStream
 * 		file read
 * 			FileInputStream
 * 2. Character Stream
 * exception:
 * IOException
 * FileNotFound Exception
 */
public class ByteStreamDemo {
public static void main(String[] args) throws Exception {
	//to create and open file
	FileOutputStream fos=new FileOutputStream("file1.txt",true);
	String str="surat ring road Tops Technology";
	byte[] data=str.getBytes();
	//to write data
	fos.write(data);
	fos.flush();
	fos.close();
	System.out.println("file written succesfuly");
	
	//to read file
	FileInputStream fis=new FileInputStream("file1.txt");
	int x;
	while((x=fis.read())!=-1) {
		System.out.print((char)x);
		
	}
		
		
}
}
