package com.project3.factorymethod;

public class SMSNotification implements Notification
{
	@Override
	public void send(String message)
	{
		System.out.println("Sending message through SMS: "+message);
	}
}