package com.Day13;

public class Synchronization {
	public static void main(String[] args) {
		Thread thread=new Thread();
		//thread.setPriority(Thread.MAX_PRIORITY-2);
		Resourse rs=new Resourse();
		F f=new F(rs);
		Thread t=new Thread(f);
		
		t.start();
		Se s=new Se(rs);
		Thread t1=new Thread(s);
		
		t1.start();
//		for(int i=1;i<=5;i++) {
//			System.out.println("main thread"+i);
//			
//		
//		}
//		System.out.println(t.getPriority());
//		
//		System.out.println(t1.getPriority());
		
	}

}
class F implements Runnable{
	Resourse resourse;
	public F(Resourse resourse) {
		this.resourse=resourse;
		
	}
	
	@Override
	
	
	public void run()
	{
		resourse.display();
		for(int i=1;i<=10;i++) {
			System.out.println("first class class");
			
			
	}
	
	}
	
	}
class Se implements Runnable{
	Resourse resourse;
	public Se(Resourse resourse) {
		this.resourse=resourse;
		
	}
	
	@Override
	
	
	public void run()
	{
		resourse.display();
		for(int i=1;i<=10;i++) {
			System.out.println("second class class");
			
			
	}
	
	}
}
class Resourse{

	public synchronized void  display() {
		System.out.println("hi");
	}
}

