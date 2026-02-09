package com.project3.singleton;

public class Main1
{
	public static void main(String[] args)
	{
		Thread user1=new Thread(new OfficeUser("Kinjal","kinjal.pdf"));
		Thread user2=new Thread(new OfficeUser("Pratik","pratik.pdf"));
		Thread user3=new Thread(new OfficeUser("Dipika","dipika.pdf"));

		user1.start();
		user2.start();
		user3.start();
	}
}