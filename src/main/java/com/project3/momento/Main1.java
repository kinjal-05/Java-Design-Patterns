package com.project3.momento;

public class Main1
{
	public static void main(String[] args)
	{
		TextEditor editor=new TextEditor();
		History history=new History();

		editor.type("Hello");
		history.save(editor.save());

		editor.type("Hello World");
		history.save(editor.save());

		editor.type("Kinjal Mistry");
		history.save(editor.save());

		System.out.println("Current: "+editor.getContent());

		editor.restore(history.undo());
		System.out.println("After Undo 1: "+editor.getContent());
		editor.restore(history.undo());
		System.out.println("After Undo 2: "+editor.getContent());
	}
}