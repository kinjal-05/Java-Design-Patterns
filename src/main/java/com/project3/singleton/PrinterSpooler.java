package com.project3.singleton;

public class PrinterSpooler
{
	private PrinterSpooler()
	{
		System.out.println("Printer Sploor Initialized");
	}

	private static class Holder
	{
		private static final PrinterSpooler INSTANCE=new PrinterSpooler();
	}

	public static PrinterSpooler getInstance()
	{
		return Holder.INSTANCE;
	}

	public void printDocument(String documentName)
	{
		System.out.println("Printing Document: "+documentName);
	}
}