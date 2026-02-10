package com.project3.momento;

public class TextEditor
{
	private String content;

	public void type(String text)
	{
		content=text;
	}

	public String getContent()
	{
		return content;
	}

	public EditorMomento save()
	{
		return new EditorMomento(content);
	}

	public void restore(EditorMomento editorMomento)
	{
		content=editorMomento.getSavedContent();
	}
}