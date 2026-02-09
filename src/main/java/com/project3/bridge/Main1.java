package com.project3.bridge;

public class Main1
{
	public static void main(String[] args)
	{
		Device tv=new TV();
		Device ac=new AirConditioner();

		RemoteControl basicRemoteForTV=new BasicRemote(tv);
		RemoteControl basicRemoteForAC=new BasicRemote(ac);

		basicRemoteForTV.powerOn();
		basicRemoteForTV.volumeUp();

		basicRemoteForAC.powerOn();
		basicRemoteForAC.powerOff();
	}
}