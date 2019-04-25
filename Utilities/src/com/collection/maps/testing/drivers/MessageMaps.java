package com.collection.maps.testing.drivers;

import java.util.HashMap;
import java.util.Map;

import com.collection.maps.testing.pojos.Message;

public class MessageMaps
{
    public static void main(String[] args) {
		
    	Map<Integer,Message> messages=new HashMap<>();
    	Message m1=new Message(101,"Hello");
    	Message m2=new Message(201,"Hii");
    	Message m3=new Message(301,"WELCOME");
    	messages.put(1,m1);
    	messages.put(2,m2);
    	System.out.println(messages);
    	addtoMap(1, m3,messages);
    	
	}
    public static void addtoMap(int pos,Message msg,Map<Integer,Message> temp)
    {
    	temp.put(pos,msg);
    	System.out.println(temp);
    }
}
