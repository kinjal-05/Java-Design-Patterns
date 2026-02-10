package com.project3.momento;

public class EditorMomento
{
	private final String content;

	public EditorMomento(String content) {
		this.content = content;
	}

	public String getSavedContent()
	{
		return content;
	}
}