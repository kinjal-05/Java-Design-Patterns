package com.project3.ChainOfResponsibility;

public class Main1
{
	public static void main(String[] args)
	{
		RequestHandler auth=new AuthenticationHandler();
		RequestHandler authorization=new AuthorizationHandler();
		RequestHandler login=new LoginHandler();
		RequestHandler business=new BusinessLogicHandler();

		auth.setNext(authorization);
		authorization.setNext(login);
		login.setNext(business);

		System.out.println("Valid Request");
		auth.handle("auth=true,role=ADMIN");
		System.out.println("Invalid Role");
		auth.handle("auth=true,role=USER");
		System.out.println("Not Authenticated");
		auth.handle("role=ADMIN");
	}
}