package com.Day13;

public class ThreaPriority {
public static void main(String[] args) {
		Thread thread=new Thread();
		thread.setPriority(Thread.MAX_PRIORITY-2);
		Fi f=new Fi();
		Thread t=new Thread(f);
		
		t.start();
		Sec s=new Sec();
		Thread t1=new Thread(t);
		
		t1.start();
		for(int i=1;i<=5;i++) {
			System.out.println("main thread"+i);
			
		
		}
		System.out.println(t.getPriority());
		
		System.out.println(t1.getPriority());
		
	}

}
class Fi implements Runnable{
	@Override
	public void run()
	{
		for(int i=1;i<=10;i++) {
			if(i%2!=0) {
			System.out.println("first thread"+i);
			}
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	}
class Sec implements Runnable{
	@Override
	public void run()
	{
		for(int i=1;i<=10;i++) {
			if(i%2==0) {
			System.out.println("second thread"+i);
			}
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	}





