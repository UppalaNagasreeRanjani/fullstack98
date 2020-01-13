package com.Day13;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileEx {
public static void main(String[] args)throws FileNotFoundException,IOException
{
	String path="C:\\Users\\Lenovo\\Desktop\\Day13\\data.txt";
	File file=new File(path);
	
System.out.println("can excute?  :"+file.canExecute());
System.out.println("can write?  :"+file.canWrite());
System.out.println("file exists?  :"+file.exists());
System.out.println("absolute path?  :"+file.getAbsolutePath());
System.out.println("File name  :"+file.getName());
System.out.println("write Data");
	
	
	
	
	FileOutputStream fout=new FileOutputStream(path);
	String ms="hi";
	byte[] b=ms.getBytes();
	fout.write(b);
	fout.close();
	
	
	
}
}
