package com.project3.ChainOfResponsibility;

public class LoginHandler extends RequestHandler
{
	@Override
	public void handle(String request)
	{
		System.out.println("Logging Request: "+request);
		if(next!=null) next.handle(request);
	}
}