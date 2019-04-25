package com.collection.maps.testing.pojos;

import java.util.Date;


public class Message {
   private int msgId;
   private String msg;
   private Date createdate;
   public Message() {
	// TODO Auto-generated constructor stub
}
   
public Message(int msgId, String msg) {
	super();
	this.msgId = msgId;
	this.msg = msg;
	this.createdate = new Date();
}

public int getMsgId() {
	return msgId;
}
public void setMsgId(int msgId) {
	this.msgId = msgId;
}
public String getMsg() {
	return msg;
}
public void setMsg(String msg) {
	this.msg = msg;
}
public Date getCreatedate() {
	return createdate;
}
public void setCreatedate(Date createdate) {
	this.createdate = createdate;
}
   public String toString()
   {
	   return "message ID: "+msgId+" message : "+msg+" created date : "+createdate;
   }
}
