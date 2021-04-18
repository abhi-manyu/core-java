package com.thread.examples.creating_new_thread;

public class MyNewThread extends Thread {
@Override
public void run() {
	//System.out.println("new thread starts");
	for(int i=0;i<10;i++)
	{
		System.out.println(i);
	}
	//System.out.println("new thread ends");
}
}
