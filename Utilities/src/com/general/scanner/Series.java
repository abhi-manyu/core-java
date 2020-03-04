package com.general.scanner;

import java.util.Scanner;

public class Series
{
	public static void main(String []argh)
	{
        Scanner in = new Scanner(System.in);
        
        int a = in.nextInt();
        int b = in.nextInt();
        int n = in.nextInt();
        
        int prev_term = a +b;
        int second_term=0;
        System.out.print(prev_term+" ");
        for(int i=1;i<n;i++)
        {
           second_term = prev_term+((int)Math.pow(2,i)*b);
           prev_term=second_term;
           System.out.print(second_term+" ");
        }
    }
}
