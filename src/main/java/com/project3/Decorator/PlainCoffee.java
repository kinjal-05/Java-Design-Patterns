package com.project3.Decorator;

public class PlainCoffee implements Coffee
{
	@Override
	public String getDescription()
	{
		return "Plain Coffee";
	}

	@Override
	public double getCost()
	{
		return 50.0;
	}
}