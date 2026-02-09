package com.project3.composite;

import java.util.ArrayList;
import java.util.List;

public class Manager implements Employee
{
	private String name;
	private String department;
	private List<Employee>subordinates=new ArrayList<>();

	public Manager(String name,String department)
	{
		this.name=name;
		this.department=department;
	}

	public void addEmployee(Employee emp)
	{
		subordinates.add(emp);
	}

	public void removeEmployee(Employee emp)
	{
		subordinates.remove(emp);
	}

	@Override
	public void showDetails()
	{
		System.out.println("Manager "+name+" Department "+department);
		System.out.println("Subordinate");
		for(Employee emp:subordinates)
		{
			emp.showDetails();
		}
	}
}