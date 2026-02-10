package com.project3.visitor;

public interface Patient
{
	public void accept(DoctorVisitor doctorVisitor);
}