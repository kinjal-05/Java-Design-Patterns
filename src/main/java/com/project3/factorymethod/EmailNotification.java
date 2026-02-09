package com.project3.factorymethod;

public class EmailNotification implements Notification
{
	@Override
	public void send(String message)
	{
		System.out.println("Sending message through Email: "+message);
	}
}