package com.project3.momento;

import java.util.Stack;

public class History
{
	private Stack<EditorMomento> history=new Stack<>();

	public void save(EditorMomento editorMomento)
	{
		history.push(editorMomento);
	}

	public EditorMomento undo()
	{
		if(!history.isEmpty())
		{
			return history.pop();
		}
		return null;
	}
}