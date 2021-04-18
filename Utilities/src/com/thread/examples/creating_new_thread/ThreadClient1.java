package com.thread.examples.creating_new_thread;

public class ThreadClient1 {

	public static void main(String[] args) {
		MyNewThread mt = new MyNewThread();
		mt.start();
		//System.out.println("main thread starts");
		for(int i=51;i<60;i++)
		{
			System.out.println(i);
		}
		//System.out.println("main thread starts");
	}
}
