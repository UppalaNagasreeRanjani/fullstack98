package com.NewProject;

public class Ex1 {
public static void main(String[] args) {
	A a=new A();
	A.B b=a.new B();
	b.display();
	
}
}

class A{
	int x=10;
 int y=20;
	class  B{
		public void display() {
		System.out.println(x);
		System.out.println(y);
		}
		
	}
}