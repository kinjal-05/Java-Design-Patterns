package com.project3.visitor;

public class Adult implements Patient
{
	@Override
	public void accept(DoctorVisitor doctorVisitor)
	{
		doctorVisitor.visit(this);
	}
}