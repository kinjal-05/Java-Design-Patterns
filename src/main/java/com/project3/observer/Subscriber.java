package com.project3.observer;

public class Subscriber implements Observer
{
	private String name;

	public Subscriber(String name) {
		this.name = name;
	}

	public void update(String videoTitle)
	{
		System.out.println(name+" got notified "+videoTitle);
	}
}