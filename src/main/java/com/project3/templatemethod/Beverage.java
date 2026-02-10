package com.project3.templatemethod;

public abstract class Beverage
{
	public final void prepareBeverage()
	{
		boilWater();
		brew();
		pourInCup();
		addCondiments();
	}

	private void boilWater()
	{
		System.out.println("Boiling Water");
	}

	private void pourInCup()
	{
		System.out.println("Pouring into cup");
	}

	protected abstract void brew();
	protected abstract void addCondiments();
}