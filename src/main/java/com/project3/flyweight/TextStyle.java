package com.project3.flyweight;

public class TextStyle
{
	private String fontFamily;
	private int fontSize;
	private boolean bold;

	public TextStyle(String fontFamily, int fontSize, boolean bold) {
		this.fontFamily = fontFamily;
		this.fontSize = fontSize;
		this.bold = bold;
	}

	public void applyStyle(char character,int position)
	{
		System.out.println("Drawing "+character+" at position "+position+" with font "+fontFamily+" size "+fontSize+(bold?", Bold":""));
	}
}