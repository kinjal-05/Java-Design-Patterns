package com.project3.abstractfactory;

public class LightThemeFactory implements UIFactory
{
	@Override
	public Button createButton()
	{
		return new LightButton();
	}

	@Override
	public CheckBox createCheckBox()
	{
		return new LightCheckBox();
	}
}