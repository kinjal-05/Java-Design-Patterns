package com.project3.ChainOfResponsibility;

public class AuthenticationHandler extends RequestHandler
{
	@Override
	public void handle(String request)
	{
		if(request.contains("auth=true"))
		{
			System.out.println("Authentication Sucessfull");
			if(next!=null) next.handle(request);
		}
		else
		{
			System.out.println("Authentication Failed, Request Blocked");
		}

	}
}