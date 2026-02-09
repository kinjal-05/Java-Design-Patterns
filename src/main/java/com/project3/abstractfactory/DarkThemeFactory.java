package com.project3.abstractfactory;

public class DarkThemeFactory implements UIFactory
{
	@Override
	public Button createButton()
	{
		return new DarkButton();
	}

	@Override
	public CheckBox createCheckBox()
	{
		return new DarkCheckBox();
	}
}