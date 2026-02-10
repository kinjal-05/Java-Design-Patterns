package com.project3.visitor;

public interface DoctorVisitor
{
	public void visit(Child child);
	public void visit(Adult adult);
	public void visit(Senior senior);
}