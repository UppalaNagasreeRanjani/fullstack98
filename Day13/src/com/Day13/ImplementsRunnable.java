package com.Day13;

public class ImplementsRunnable {
public static void main(String[] args) {
		
		Fir f=new Fir();
		Thread t=new Thread(f);
		
		t.start();
		Seco s=new Seco();
		Thread t1=new Thread(t);
		
		t1.start();
		for(int i=1;i<=5;i++) {
			System.out.println("main thread"+i);
		
		}
		
	}

}
class Fir implements Runnable{
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
class Seco implements Runnable{
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



