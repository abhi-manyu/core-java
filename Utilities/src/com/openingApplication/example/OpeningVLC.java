package com.openingApplication.example;

public class OpeningVLC
{
	public static void main(String[] args)
		{
			Runtime rt = Runtime.getRuntime();
			try
			{
				String file="E:\\Movies\\Black Panther\\Black_Panther.mp4";
				rt.exec("C:\\Program Files\\VideoLAN\\VLC\\vlc "
						+ file);
			} catch (Exception e)
			{
				System.out.println("i m sorry, i can not open");
			}
		}
}
