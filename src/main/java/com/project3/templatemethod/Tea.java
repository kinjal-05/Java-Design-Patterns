package com.project3.templatemethod;

public class Tea extends Beverage
{
	@Override
	protected void addCondiments()
	{
		System.out.println("Adding Lemon");
	}

	@Override
	protected void brew()
	{
		System.out.println("Steeping tea leaves");
	}
}