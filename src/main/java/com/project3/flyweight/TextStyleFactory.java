package com.project3.flyweight;

import java.util.HashMap;
import java.util.Map;

public class TextStyleFactory
{
	public static final Map<String,TextStyle> styles=new HashMap<>();
	public static TextStyle getStyle(String font,int size,boolean bold)
	{
		String key=font+size+bold;
		if(!styles.containsKey(key))
		{
			styles.put(key,new TextStyle(font,size,bold));
			System.out.println("Craete New Style: "+key);
		}
		return styles.get(key);
	}
}