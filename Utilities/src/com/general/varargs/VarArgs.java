package com.general.varargs;

public class VarArgs {

	public static void main(String[] args) {
		System.out.println("example of the var args");
		add(5,7,56);
	}
	public static void add(int...a)
	{
		int sum =0;
		for(int i=0;i<a.length;i++)
		{
			sum+=a[i];
		}
		System.out.println("the total sum is : "+sum);
	}
}
