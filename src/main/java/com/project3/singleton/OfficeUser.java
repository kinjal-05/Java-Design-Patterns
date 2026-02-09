package com.project3.singleton;

public class OfficeUser implements Runnable
{
	private String userName;
	private String documentName;

	public OfficeUser(String userName,String documentName)
	{
		this.userName=userName;
		this.documentName=documentName;
	}

	@Override
	public void run()
	{
		PrinterSpooler spooler=PrinterSpooler.getInstance();
		System.out.println("UserName: "+userName+" got Print Spooler Instance "+spooler.hashCode());
		System.out.println(documentName);
	}
}