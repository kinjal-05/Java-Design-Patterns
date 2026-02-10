package com.project3.observer;

public class Main1
{
	public static void main(String[] args)
	{
		YouTubeChannel youTubeChannel=new YouTubeChannel();

		Observer s1=new Subscriber("Kinjal");
		Observer s2=new Subscriber("Pratik");

		youTubeChannel.subscribe(s1);
		youTubeChannel.subscribe(s2);

		youTubeChannel.uploadVideo("Observer Pattern In Java");
	}
}