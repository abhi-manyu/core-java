package com.general.messaging;

public class HitXmlData {
	public static void main(String[] args)
	{
    		String strUrl = "http://api.msg91.com/api/postsms.php";
    		String xmlData = "data=<MESSAGE>"
                                        +"<AUTHKEY>3061746e4f47353635333034</AUTHKEY>"
                                        +"<ROUTE>default</ROUTE>"
                                        +"<SMS TEXT='message1 testing' FROM='917205525414'>"
                                         +"   <ADDRESS TO='918095113494'></ADDRESS>"
                                        +"</SMS>"
                                    +"</MESSAGE>";

		String output = Functions.hitUrl(strUrl, xmlData);
		System.out.println("Output is: "+output);

	}
}
