package com.project3.builder;

public class Main1
{
	public static void main(String[] args)
	{
		User user=new User.UserBuilder("Kinjal","Mistry").age(20).email("kinjal@gmail.com").isVerified(true).build();
		System.out.println(user);
	}
}