package com.general.series;

import java.util.Arrays;
import java.util.List;

class Someone
{
	public static double sumOfList(List<?extends Number> list)
	{
		double sum =0.0;
		for(Number n: list)
		{
			sum += n.doubleValue();
		}
		return sum;
	}
	
	public static void main(String[] args) {
		
		List<Double> ld = Arrays.asList(3.2,5.3,2.6);
		System.out.println(sumOfList(ld));
		
	}
}
