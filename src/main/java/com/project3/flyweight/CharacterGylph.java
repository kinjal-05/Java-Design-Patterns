package com.project3.flyweight;

public class CharacterGylph
{
	private char character;
	private int position;
	private TextStyle style;

	public CharacterGylph(char character, int position, TextStyle style) {
		this.character = character;
		this.position = position;
		this.style = style;
	}

	public void draw()
	{
		style.applyStyle(character,position);
	}
}