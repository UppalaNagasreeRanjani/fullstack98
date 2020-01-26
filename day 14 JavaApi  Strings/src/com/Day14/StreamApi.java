package com.Day14;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamApi {
	public static void main(String[] args) {
		List<String> name=new ArrayList<String>();
		
		addNames(name);
		name.forEach(System.out::println);
		List<String> lengthScale=name.stream().filter(s->s.length()<=5).collect(Collectors.toList());
		lengthScale.forEach(System.out::println);
		List<String> capName=name.stream().map(n->n.toUpperCase()).collect(Collectors.toList());
		capName.forEach(System.out::println);
		
		
		}
	private static void addNames(List<String>name) {
		name.add("abin");
		name.add("sri");
		name.add("syed");
		
	}

}
