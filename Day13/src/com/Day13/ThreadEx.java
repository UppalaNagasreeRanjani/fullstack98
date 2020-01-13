package com.Day13;

public class ThreadEx {
	public static void main(String[] args) {
		Thread thread=Thread.currentThread();
		System.out.println(thread);
		System.out.println("name of the thread:      "  +thread.getName());
		thread.setName("sri");
		System.out.println(thread.getName());
		System.out.println(thread.isDaemon());
		System.out.println(thread.isAlive());
		System.out.println(thread.getState());
		System.out.println(thread.getId());
	}
	

}
