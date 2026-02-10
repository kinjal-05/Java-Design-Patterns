package com.project3.iterator;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Main1
{
	public static void main(String[] args)
	{
		List<String> name=Arrays.asList("Kinjal","Pratik","Dipika","Bhavesh");
		Iterator<String> iterator= name.iterator();

		while (iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
	}
}