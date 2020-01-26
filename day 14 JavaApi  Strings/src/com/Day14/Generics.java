package com.Day14;

//import java.util.ArrayList;
//import java.util.List;

public class Generics<T> {

	private T t;
	
	public T get(){
		return this.t;
	}
	
	public void set(T t1){
		this.t=t1;
	} 
	
	
	
	
	
	
	public static void main(String[] args)throws ClassCastException {
//		List<String>list=new ArrayList<String>();
//		list.add("sri");
//		list.add("naga");
//		for(String s:list){
//			String name=s;
//			System.out.println(name);
		Generics<String> type = new Generics<>();
		type.set("sri"); //valid
		String n = type.get();
		Generics type1 = new Generics(); //raw type
		type1.set("naga"); //valid
		type1.set(10); //valid and autoboxing support
		Generics<Integer> type2 = new Generics<>();

		
		
	}

}
