package com.project3.command;

public class TurnOnCommand implements Command
{
	private TV tv;

	public TurnOnCommand(TV tv) {
		this.tv = tv;
	}

	@Override
	public void execute()
	{
		tv.turnOn();
	}

	@Override
	public void undo()
	{
		tv.turnOff();
	}
}