package com.project3.observer;

import java.util.ArrayList;
import java.util.List;

public class YouTubeChannel implements Subject
{
	private List<Observer> subscribers=new ArrayList<>();
	private String latestVideo;

	public void subscribe(Observer o)
	{
		subscribers.add(o);
	}

	public void unsubscribe(Observer o)
	{
		subscribers.remove(o);
	}

	public void uploadVideo(String title)
	{
		this.latestVideo=title;
		notifyObservers();
	}

	public void notifyObservers()
	{
		for(Observer o:subscribers)
		{
			o.update(latestVideo);
		}
	}
}
