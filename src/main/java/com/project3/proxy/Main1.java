package com.project3.proxy;


public class Main1
{
	public static void main(String[] args)
	{
		Video video1=new VideoProxy("kinjal.mp4");
		Video video2=new VideoProxy("pratik.mp4");

		System.out.println("You Can See Video");

		video1.play();
		System.out.println();
		video2.play();
	}
}