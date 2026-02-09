package com.project3.ChainOfResponsibility;

public class BusinessLogicHandler extends RequestHandler
{
	@Override
	public void handle(String request)
	{
		System.out.println("Processing Business Logic For Request");
	}
}
