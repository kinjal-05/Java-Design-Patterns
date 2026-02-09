package com.project3.abstractfactory;

public class Main1
{
	public static void main(String[] args)
	{
		UIFactory factory;
		String theme="DARK";
		if(theme.equalsIgnoreCase("LIGHT"))
		{
			factory=new LightThemeFactory();
		}
		else
		{
			factory=new DarkThemeFactory();
		}

		Application app=new Application(factory);
		app.renderUI();
	}
}