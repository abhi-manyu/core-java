package com.general.array;

//there are 5 positive numbers in a array . u have to calculate
// the sum of maximum 4 digits and sum of minimum 4 digits
// here min_sum=3+5+7+8=23 and 5+7+8+9=29
// calculate 1st max, 2nd max, 3rd max, 4 max add them 
// calculate 1st min , 2nd min , 3rd min, 4th min and add them


public class Array
{
	static int max_Sum=0; 
	static int min_Sum=0; 
	
	public static void main(String[] args)
	{
        int[] arr= {5,8,3,7,9};
        print_MaxSum(arr);
        print_Min_Sum(arr);
        print();
	}
	
	static void print_MaxSum(int[] arr)
	{
		if(arr.length<=1)
			return;
		
		int i,j;
		int max=arr[0];
		int max_index=0;
		
		for(i=1;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
				max_index=i;
			}
		}
		
		int[] temp_Arr=new int[arr.length-1];
		for(j=0,i=0;j<temp_Arr.length;j++,i++)
		{
			if(i==max_index)
			{
				j--; 
				continue;
			}
			temp_Arr[j]=arr[i];
		}
		arr=temp_Arr;
		max_Sum+=max;
		print_MaxSum(arr);
	}
		
		
	public static void print_Min_Sum(int[] arr)
	{
		int a,b;
		int min=arr[0];
		int min_index=0;
		
		for(a=1;a<arr.length;a++)
		{
			if(min>arr[a])
			{
				min=arr[a];
				min_index=a;
			}
		}
		int[] temp_Arr2=new int[arr.length-1];
		for(b=0,a=0;b<temp_Arr2.length;b++,a++)
		{
			if(a==min_index && a!=0)
			{
				b--; 
				continue;
			}
			temp_Arr2[b]=arr[a];
		}
		arr=temp_Arr2;
		min_Sum+=min;
		print_Min_Sum(arr);
	}
	
		
		
	public static void print()
	{
		System.out.println(max_Sum);
		System.out.println(min_Sum);
	}
}
