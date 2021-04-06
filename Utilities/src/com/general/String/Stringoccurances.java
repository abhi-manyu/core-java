package com.general.String;

import java.util.HashMap;
import java.util.Map;

public class Stringoccurances
{
    public static void main(String[] args)
    {
		String s= "Hello hi Hi hello hi hello Hi hello";
		coundWords(s);
	}
    
    // case sensitive
    /*public static void coundWords(String s1)
    {
    	Map<String,Integer> words = new HashMap<String, Integer>();
    	String[] arr = s1.split(" ");
    	for(String word:arr)
    	{
    		int counter=1;
    		if(words.containsKey(word))
    		{
    			counter++;
    			words.put(word, counter);
    		}
    		else
    			words.put(word, counter);
    	}
    	System.out.println(words);
    }*/
    
    public static void coundWords(String s1)
    {
    	String[] arr = s1.split(" ");
    	Map<String,Integer> words = new HashMap<String, Integer>();
    	int counter = 1;
    	for(String word:arr)
    	{
    		if(words.containsKey(word.toLowerCase()))
    		{
    			counter = words.get(word.toLowerCase());
    			counter++;
    			words.put(word.toLowerCase(), counter);
    		}
    		else
    			words.put(word.toLowerCase(),counter);
    	}
    	System.out.println(words);
    }
}
