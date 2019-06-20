package com.general.String;

public class TimeConvrt
{

	public static void main(String[] args)
	{
		String s="12:45:54PM";
		System.out.println(changeDate(s));
	}
	
	public static String changeDate(String date)
	{
		String text=date.charAt(8)+"";
		char[] times=null;
		if(text.equalsIgnoreCase("p") && !date.contains("12"))
		{
			times=date.toCharArray();
			int hour=Integer.parseInt(times[0]+""+times[1]);
			hour+=12;
			String fin_date=hour+"";
			for(int i=2;i<times.length-2;i++)
				fin_date+=times[i];
			return fin_date;
		}
		else if(text.equalsIgnoreCase("A"))
			return date;
		else
			return "please enter in correct format";
	}
}
