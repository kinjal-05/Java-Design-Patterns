package com.project3.mediator;

public class Main1
{
	public static void main(String[] args)
	{
		ChatMediator chatRoom=new ChatRoom();
		User Kinjal=new ChatUser(chatRoom,"Kinjal");
		User Pratik=new ChatUser(chatRoom,"Pratik");
		chatRoom.add(Kinjal);
		chatRoom.add(Pratik);

		Kinjal.send("Hello Pratik");
		System.out.println();
		Pratik.send("Hello Kinjal");
	}
}