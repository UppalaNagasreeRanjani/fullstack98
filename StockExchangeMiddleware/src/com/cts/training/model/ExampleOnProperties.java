package com.cts.training.model;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;

public class ExampleOnProperties {
public static void main(String[] args) throws IOException,FileNotFoundException {
	//Properties p=System.getProperties();//to get system properties
	//System.out.println(p);
	//Properties p= new Properties();// to get properties from notepad file
//	FileInputStream fin=new FileInputStream("src\\connection.properties");
//	p.load(fin);
//	System.out.println("username"+p.getProperty("username"));
//	Properties p=System.getProperties();//using generics
//	Set<Entry<Object,Object>>set=p.entrySet();
//	for(Map.Entry<Object, Object>entry:set) {
//		System.out.println(entry.getKey()+""+entry.getValue());
	//}
	Properties p=System.getProperties();// with out using generics 
	Set s=p.entrySet();
	for(Object e:s) {
		System.out.println(e);
	}
	}
}