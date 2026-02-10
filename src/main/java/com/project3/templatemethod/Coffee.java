package com.project3.templatemethod;

public class Coffee extends Beverage
{
	@Override
	protected void brew()
	{
		System.out.println("Brewing Coffee Power");
	}

	@Override
	protected void addCondiments()
	{
		System.out.println("Adding Milk And Sugar");
	}
}