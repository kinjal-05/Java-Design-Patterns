package com.project3.proxy;

public class RealVideo implements Video
{
	private String fileName;

	public RealVideo(String fileName) {
		this.fileName = fileName;
		loadFromServer();
	}

	private void loadFromServer()
	{
		System.out.println("Loading Video From Server: "+fileName);
	}

	@Override
	public void play()
	{
		System.out.println("Playing Video: "+fileName);
	}
}