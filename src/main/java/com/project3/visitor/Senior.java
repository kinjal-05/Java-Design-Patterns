package com.project3.visitor;

public class Senior implements Patient
{
	@Override
	public void accept(DoctorVisitor doctorVisitor)
	{
		doctorVisitor.visit(this);
	}
}