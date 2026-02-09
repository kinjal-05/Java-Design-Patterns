package com.project3.ChainOfResponsibility;

public class AuthorizationHandler extends RequestHandler
{
	@Override
	public void handle(String request)
	{
		if(request.contains("role=ADMIN"))
		{
			System.out.println("Authorization Successfull");
			if(next!=null) next.handle(request);
		}
		else
		{
			System.out.println("Authorization Failed, Access Denied");
		}
	}
}