package com.methods;


public class Methods1 {

	public static void main(String[] args) {
		System.out.println("main method starts");
		System.out.println(getReturnInt(8));
		System.out.println("main method ends");
	}
	
	static int getReturnInt(int num)
	{
		if(num>10)
			return num;
		return num+(10-num);
	}

}
