package com.project3.visitor;

public class Dentist implements DoctorVisitor
{
	@Override
	public void visit(Adult adult)
	{
		System.out.println("Checking teeth of adult");
	}

	@Override
	public void visit(Child child)
	{
		System.out.println("Checking teeth of child");
	}

	@Override
	public void visit(Senior senior)
	{
		System.out.println("Checking teeth of senior");
	}
}