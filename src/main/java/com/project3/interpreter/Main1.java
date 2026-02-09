package com.project3.interpreter;

public class Main1
{
	public static void main(String[] args)
	{
		Expression num1=new NumberExpression(10);
		Expression num2=new NumberExpression(5);
		Expression num3=new NumberExpression(3);

		Expression add=new AddExpression(num1,num2);
		Expression result=new SubstractExpression(add,num3);
		System.out.println(result.interpret());
	}
}