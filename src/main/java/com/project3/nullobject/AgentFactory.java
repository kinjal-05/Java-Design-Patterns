package com.project3.nullobject;

public class AgentFactory
{
	public static SupportAgent getAgent(String name)
	{
		if(name==null || name.isEmpty())
		{
			return new NoAgent();
		}
		else
		{
			return new RealAgent(name);
		}
	}
}