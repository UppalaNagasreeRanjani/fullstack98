package com.NewProject;

import java.util.PriorityQueue;

public class Setone {
	public static void main(String[] args) {
		PriorityQueue<String>pt=new PriorityQueue<String>();
		pt.add("hi");
		pt.add("hello");
		pt.add("strin");
		System.out.println(pt);
		//for(String s:pt) {
			//System.out.println(s);
		//}
		//String se=pt.poll();
		System.out.println(pt.poll());
		//System.out.println(se);
		System.out.println(pt);
		String be=pt.element();
		System.out.println(be);
	}
//
}
