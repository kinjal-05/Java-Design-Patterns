package com.project3.composite;

public class Main1
{
	public static void main(String[] args)
	{
		Employee emp1=new Developer("Kinjal Mistry","Backend Developer");
		Employee emp2=new Developer("Pratik Mistry","Frontend Developer");

		Employee emp3=new Designer("Dipika Mistry","Technology");

		Manager techLead=new Manager("Bhavesh Mistry","Technology");
		techLead.addEmployee(emp1);
		techLead.addEmployee(emp2);

		Manager headManager=new Manager("Bhavana Mistry","Engineering");
		headManager.addEmployee(emp3);
		headManager.addEmployee(techLead);

		headManager.showDetails();
	}
}