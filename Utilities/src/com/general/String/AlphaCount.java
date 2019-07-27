package com.general.String;

public class AlphaCount {

	public static void main(String[] args) {
		String s="Hel5lo wor99ld";
        countAlphabates(s);
	}
	
	public static void countAlphabates(String s)
	{
		char ch;
		String temp;
		int occur;
		while(s.length()>0 && s!=null)
		{
		  occur=0;
		  ch=s.charAt(0);
		  temp = s.replaceAll(ch+"","");
		  occur=s.length()-temp.length();
		  if(ch==' ')
			  System.out.println("space-----"+occur+"times");
		  else
			  System.out.println(ch+"-----"+occur+" times");
		  s=temp;
		}
		
	}

}
