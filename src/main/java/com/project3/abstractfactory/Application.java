package com.project3.abstractfactory;

public class Application
{
	private Button button;
	private CheckBox checkBox;

	public Application(UIFactory factory)
	{
		button=factory.createButton();
		checkBox=factory.createCheckBox();
	}

	public void renderUI()
	{
		button.render();
		checkBox.render();
	}
}