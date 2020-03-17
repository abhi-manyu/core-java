package com.general.varargs;

public class Varargs2 {

	public static void main(String[] args) {
		//printnumbers(nums);

	}
	
	public static void printnumbers(int... nums)
	{
		for(int i =0;i<nums.length;i++)
		{
			System.out.println(nums[i]);
		}
	}

}
