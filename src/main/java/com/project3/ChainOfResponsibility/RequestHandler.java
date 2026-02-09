package com.project3.ChainOfResponsibility;

public abstract class RequestHandler
{
	protected RequestHandler next;

	public void setNext(RequestHandler next)
	{
		this.next=next;
	}

	public abstract void handle(String request);
}