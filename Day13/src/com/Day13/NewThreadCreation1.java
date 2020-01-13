package com.Day13;

public class NewThreadCreation1 {
	public static void main(String[] args) {
		
		First f=new First();
		f.start();
		Second s=new Second();
		s.start();
		for(int i=1;i<=5;i++) {
			System.out.println("main thread"+i);
		
		}
		
	}

}
class First extends Thread{
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
class Second extends Thread{
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
