package com.project3.observer;

public interface Subject
{
	public void subscribe(Observer o);
	public void unsubscribe(Observer o);
	public void notifyObservers();
}