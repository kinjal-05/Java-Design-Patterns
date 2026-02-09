package com.project3.command;

public class Main1
{
	public static void main(String[] args)
	{
		TV tv=new TV();
		Command turnOn=new TurnOnCommand(tv);
		Command turnOff=new TurnOffCommand(tv);

		RemoteControl remoteControl=new RemoteControl();

		remoteControl.setCommand(turnOn);
		remoteControl.pressButton();
		remoteControl.pressUndo();
		System.out.println();

		remoteControl.setCommand(turnOff);
		remoteControl.pressButton();
		remoteControl.pressUndo();

	}
}