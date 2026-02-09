package com.project3.factorymethod;

public class EmailNotificationCreator extends NotificationCreator
{
	@Override
	protected Notification createNotification()
	{
		return new EmailNotification();
	}
}