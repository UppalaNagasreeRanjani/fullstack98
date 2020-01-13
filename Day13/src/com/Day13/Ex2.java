package com.Day13;

import java.io.CharArrayReader;
import java.io.CharArrayWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ex2 {
	public static void main(String[] args)throws FileNotFoundException,IOException
	{
		String path="C:\\Users\\Lenovo\\Desktop\\Day13\\data.txt";
//FileInputStream fin=new FileInputStream(path);
char[] ch= new char[] {'a','b','c'};
//CharArrayReader ca=new CharArrayReader(ch);
//ca.read(ch);
//System.out.println(ch);
CharArrayWriter ca1=new CharArrayWriter();
for(char ch1:ch)
ca1.write(ch1);
System.out.println(ch);

	
ca1.close();

}
}