package com.fileIO;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/*
 * File : it is a class
 */
class FDemo{
	File file;
	public FDemo() throws IOException {
		file=new File("file3.txt");
		// to create and open file
		file.createNewFile();
		display();
	}
	public void display() {
		System.out.println("is file or not :"+file.isFile());
		System.out.println("is directory or not :"+file.isDirectory());
		System.out.println("file name: "+file.getName());
		System.out.println("file path: "+file.getPath());
		System.out.println("file absolute path: "+file.getAbsolutePath());
		System.out.println("can read or not: "+file.canRead());
		System.out.println("can execute or not: "+file.canExecute());
		System.out.println("can write or not: "+file.canWrite());
	}
}
public class FileDemo {
public static void main(String[] args) throws IOException {
	new FDemo();
}
}
