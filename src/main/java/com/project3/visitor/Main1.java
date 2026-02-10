package com.project3.visitor;


public class Main1
{
	public static void main(String[] args)
	{
		Patient[] patients={new Child(), new Adult(), new Senior()};

		DoctorVisitor doctorVisitor1=new Dentist();
		DoctorVisitor doctorVisitor2=new Cardiologist();

		for(Patient p:patients)
		{
			p.accept(doctorVisitor1);
		}

		System.out.println();

		for(Patient p:patients)
		{
			p.accept(doctorVisitor2);
		}
	}
}