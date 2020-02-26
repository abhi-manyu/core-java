package com.oops.polymerphism.example1;

public class Rider {

	void ride(BIke b)
	{
		System.out.println("in ride method of BIke type");
		b.start();
	}
	
	void ride(Pulser p)
	{
		System.out.println("in ride method of Puser type");
		p.start();
	}
}
