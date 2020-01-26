package com.NewProject;

public class Stringbuffer {
	public static void main(String[] args)

	{
		StringBuffer sb=new StringBuffer("hellonagasri");
		System.out.println(sb.capacity());
		sb.append("chennai");
		System.out.println(sb.capacity());
		
		sb.append("andhtra");
		sb.insert(3, "chewnnai");
		
		System.out.println(sb.capacity());
		sb.delete(2, 6);
		System.out.println(sb);
		sb.replace(2,5 , "hi");
		sb.ensureCapacity(6);
		System.out.println(sb);
	}
}