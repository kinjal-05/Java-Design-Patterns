package com.project3.mediator;

public interface ChatMediator
{
	void sendMessage(String message,User user);
	void add(User user);
}