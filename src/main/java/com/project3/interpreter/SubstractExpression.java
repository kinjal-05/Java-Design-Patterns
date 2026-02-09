package com.project3.interpreter;

public class SubstractExpression implements Expression
{
	private Expression left;
	private Expression right;

	public SubstractExpression(Expression left, Expression right) {
		this.left = left;
		this.right = right;
	}

	@Override
	public int interpret()
	{
		return left.interpret()- right.interpret();
	}
}
