package com.NewProject;

import java.util.Scanner;
import java.util.*;

public class Concrete {
	public static  void main(String[] args) {
Ce c=new Ce() {
@Override
public void display(){
	System.out.println("iiiiiiii");
	//Scanner
}
};

c.display();
}
	
}

interface Ce{


	 public void display() ;
		//System.out.println("hi");
		
	}
	