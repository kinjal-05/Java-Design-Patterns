package com.project3.flyweight;

public class Main1
{
	public static void main(String[] args)
	{
		Document doc=new Document();

		doc.addCharacter('H',1,"Arial",12,true);
		doc.addCharacter('B',2,"Arial",12,true);
		doc.addCharacter('D',3,"Arial",12,true);
		doc.addCharacter('P',4,"Arial",12,true);
		doc.addCharacter('K',5,"Arial",12,false);

		doc.render();
	}
}