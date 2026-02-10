package com.project3.nullobject;

public class Main1
{
	public static void main(String[] args)
	{
		SupportAgent supportAgent1=AgentFactory.getAgent("Kinjal");
		SupportAgent supportAgent2=AgentFactory.getAgent(null);

		System.out.println("Agent 1: "+supportAgent1.getName());
		System.out.println("Agent 2: "+supportAgent2.getName());
	}
}