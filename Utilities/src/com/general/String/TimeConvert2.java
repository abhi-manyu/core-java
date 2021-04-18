package com.general.String;

public class TimeConvert2
{

	public static void main(String[] args)
	{
		String s="15:00:00AM";
		System.out.println(changeDate(s));
	}

	private static String changeDate(String date)
	{
		if(date.endsWith("PM") && !date.substring(0,2).equals("12"))
	       {
	            int hrs = 12 + Integer.parseInt(date.substring(0,2));
	            String rem = date.substring(2,8);
	            return hrs + rem;
	        }
	        else
	        {
	            if(date.substring(0,2).equals("12") && date.endsWith("AM"))
	            {
	                String hrs = "00";
	                String rem = date.substring(2,8);
	                return hrs + rem;
	            }
	            else
	                return date.substring(0,8);
	        }
	}

}
