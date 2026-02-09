package com.project3.flyweight;

import java.util.ArrayList;
import java.util.List;

public class Document
{
	private List<CharacterGylph>characters=new ArrayList<>();

	public void addCharacter(char c,int position,String font,int size,boolean bold)
	{
		TextStyle style=TextStyleFactory.getStyle(font,size,bold);
		characters.add(new CharacterGylph(c,position,style));
	}

	public void render()
	{
		for(CharacterGylph ch:characters)
		{
			ch.draw();
		}
	}
}