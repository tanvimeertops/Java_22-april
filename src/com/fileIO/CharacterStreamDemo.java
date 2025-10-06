package com.fileIO;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * Character Stream Demo: 2 byte
 * 		file write:
 * 			FileWriter
 * 		file read
 * 			FileReader
 * 
 */
public class CharacterStreamDemo {
public static void main(String[] args) throws IOException {
	//to create and open file
	FileWriter fw=new FileWriter("file2.txt");
	String str="27th sep is the graduation ceremony ";
	fw.write(str);
	fw.flush();
	fw.close();
	
	
	
	
	
	
	System.out.println("data written successfully");
	
	FileReader fr=new FileReader("file2.txt");
	int x;
	while((x=fr.read())!=-1) {
		System.out.print((char)x);
	}
	
}
}
