package com.project3.Decorator;

public class Main1
{
	public static void main(String[] args)
	{
		Coffee coffee=new PlainCoffee();
		System.out.println(coffee.getDescription()+" "+ coffee.getCost());

		coffee=new MilkDecorator(coffee);
		coffee=new SugarDecorator(coffee);
		coffee=new WhippedCreamDecorator(coffee);
		System.out.println(coffee.getCost()+" "+coffee.getCost());
	}
}