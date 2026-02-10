package com.project3.templatemethod;

public class Main1
{
	public static void main(String[] args)
	{
		Beverage tea=new Tea();
		tea.prepareBeverage();

		System.out.println();

		Beverage coffee=new Coffee();
		coffee.prepareBeverage();
	}
}