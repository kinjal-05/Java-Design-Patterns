package com.project3.factorymethod;

public class Main1
{
	public static void main(String[] args)
	{
		NotificationCreator notificationCreator;
		notificationCreator=new EmailNotificationCreator();
		notificationCreator.notifyUser("Welcome Via Email");

		notificationCreator=new SMSNotificationCreator();
		notificationCreator.notifyUser("Welcome Via SMS");
	}
}