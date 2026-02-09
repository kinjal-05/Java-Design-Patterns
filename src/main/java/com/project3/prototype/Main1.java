package com.project3.prototype;

public class Main1
{
	public static void main(String[] args)
	{
		Report report1=ReportRegistery.getReport("SALES");
		report1.generate("Sales Data From January");

		Report report2=ReportRegistery.getReport("SALES");
		report2.generate("Sales Data From February");
	}
}