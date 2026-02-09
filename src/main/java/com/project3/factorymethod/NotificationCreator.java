package com.project3.factorymethod;


public abstract class NotificationCreator
{
	protected abstract Notification createNotification();

	public void notifyUser(String message)
	{
		Notification notification=createNotification();
		notification.send(message);
	}
}