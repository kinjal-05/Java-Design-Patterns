package com.project3.command;

public class RemoteControl
{
	private Command command;

	public Command getCommand() {
		return command;
	}

	public void setCommand(Command command) {
		this.command = command;
	}

	public RemoteControl(Command command) {
		this.command = command;
	}

	public void pressButton()
	{
		command.execute();
	}

	public void pressUndo()
	{
		command.undo();
	}

	public RemoteControl() {
	}
}