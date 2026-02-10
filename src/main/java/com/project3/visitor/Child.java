package com.project3.visitor;

public class Child implements Patient
{
	@Override
	public void accept(DoctorVisitor doctorVisitor)
	{
		doctorVisitor.visit(this);
	}
}