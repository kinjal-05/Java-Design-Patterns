package com.project3.prototype;

import java.util.HashMap;
import java.util.Map;

public class ReportRegistery
{
	private static final Map<String,Report> prototypes=new HashMap<>();

	static
	{
		prototypes.put("SALES",new SalesReport());
	}

	public static Report getReport(String type)
	{
		Report prototype=prototypes.get(type);
		return prototype.clone();
	}
}