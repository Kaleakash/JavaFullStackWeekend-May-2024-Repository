package com;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.io.PrintWriter;

public class ByteClasses {

	public static void main(String[] args) throws Exception{
//		System.out.println("Welcome");
//		PrintStream ps = System.out;
//		ps.println("Welcome to Java");
//		InputStream is = System.in;
//		// source --> keyboard, target --> console 
//		DataInputStream dis = new DataInputStream(System.in);
//		PrintStream ps = System.out;
//		ps.println("Enter the name");
//		String name = dis.readLine();
//		ps.println("name is "+name);
		
//		// source --> keyboard, target --> file 
//		DataInputStream dis = new DataInputStream(System.in);
//		FileOutputStream fos = new FileOutputStream("abc.txt",true);
//		System.out.println("Enter the data");
//		int ch;
//		while((ch=dis.read()) != '@') {
//			System.out.println(ch+" "+(char)ch);
//			fos.write(ch);
//		}
//		fos.close();
//		System.out.println("Data stored...");
		
//		// source --> file, target --> file or console
//				FileInputStream fis = new FileInputStream("C:\\Users\\akash\\Desktop\\EC2 Plugin Install.txt");
//				FileOutputStream fos = new FileOutputStream("demo.txt");
//				int ch;
//				while((ch=fis.read()) != -1) {		//EOF : end of the file in java is -1
//					System.out.print((char)ch);
//					fos.write(ch);
//				}
//				fis.close();
//				fos.close();
//				System.out.println("Data copied...");
		
		// source --> file, target --> file or console
		FileInputStream fis = new FileInputStream("C:\\Users\\akash\\Desktop\\EC2 Plugin Install.txt");
		BufferedInputStream bis = new BufferedInputStream(fis,512);
		FileOutputStream fos = new FileOutputStream("demo.txt");
		int ch;
		while((ch=bis.read()) != -1) {		//EOF : end of the file in java is -1
			System.out.print((char)ch);
			fos.write(ch);
		}
		fis.close();
		fos.close();
		System.out.println("Data copied...");
	}

}


