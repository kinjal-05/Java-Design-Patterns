package com.project3.factorymethod;


public class SMSNotificationCreator extends NotificationCreator
{
	@Override
	protected Notification createNotification()
	{
		return new SMSNotification();
	}
}