package com.NewProject;

import com.NewProject.A.B;

public class Inner {
	public static void main(String[] args) {
		A a=new A();
		A.B b=new A.B();
		//b.display();
		
	}
	}

	class A{
		int x=10;
	  static int y=20;
		static class  B{
			public void display() {
			//System.out.println(x);
			System.out.println(y);
			}
			
		}
	}