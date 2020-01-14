package com.Day14;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Serialization {
	public static Object deserialize(String filename)throws IOException,ClassNotFoundException {
		FileInputStream fin=new FileInputStream(filename);
		
	BufferedInputStream bin=new BufferedInputStream(fin);
	ObjectInputStream oin=new ObjectInputStream(bin);
	 Object obj=oin.readObject();
	 return obj;
	}
	public static void serialize(Object obj,String filename) throws IOException  {
		FileOutputStream fout=new FileOutputStream( filename);
		BufferedOutputStream bout=new BufferedOutputStream(fout);
		ObjectOutputStream out=new ObjectOutputStream(bout);
		out.writeObject(obj);
		out.close();
		bout.close();
		fout.close();
		}
	
	public static void main(String[] args)throws ClassNotFoundException {
		Employee emp=new Employee(123,"syed","guntur",26,676873,676763);
		
		try {
			serialize(emp,"serial.txt");
		Employee emp1=(Employee) deserialize("serial.txt");
		System.out.println(emp1);
		}
		catch(IOException  e){
			System.out.println("getmessage"+e.getMessage());
			
		}
		
		
		
		}
}
