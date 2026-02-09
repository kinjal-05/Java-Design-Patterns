package com.project3.proxy;

public class VideoProxy implements Video
{
	private String fileName;
	private RealVideo realVideo;

	public VideoProxy(String fileName)
	{
		this.fileName=fileName;
	}

	@Override
	public void play()
	{
		if(realVideo==null)
		{
			realVideo=new RealVideo(fileName);
		}
		realVideo.play();
	}
}
