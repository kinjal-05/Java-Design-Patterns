package com.project3.visitor;

public class Cardiologist implements DoctorVisitor
{
	@Override
	public void visit(Adult adult)
	{
		System.out.println("Checking heart of adult");
	}

	@Override
	public void visit(Child child)
	{
		System.out.println("Checking heart of child");
	}

	@Override
	public void visit(Senior senior)
	{
		System.out.println("Checking heart of senior");
	}
}