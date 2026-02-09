package com.project3.builder;

public class User
{
	private final String firstName;
	private final String lastName;

	private final int age;
	private final String phone;
	private final String address;
	private final String email;
	private final boolean isVerified;

	private User(UserBuilder userBuilder)
	{
		this.firstName=userBuilder.firstName;
		this.lastName=userBuilder.lastName;
		this.age=userBuilder.age;
		this.phone=userBuilder.phone;
		this.address=userBuilder.address;
		this.email=userBuilder.email;
		this.isVerified=userBuilder.isVerified;
	}

	public static class UserBuilder
	{
		private final String firstName;
		private final String lastName;

		private int age=0;
		private String phone="";
		private String address="";
		private String email="";

		private boolean isVerified=false;

		public UserBuilder(String firstName, String lastName) {
			this.firstName = firstName;
			this.lastName = lastName;
		}

		public UserBuilder age(int age)
		{
			this.age=age;
			return this;
		}

		public UserBuilder phone(String phone)
		{
			this.phone=phone;
			return this;
		}

		public UserBuilder address(String address)
		{
			this.address=address;
			return this;
		}

		public UserBuilder email(String email)
		{
			this.email=email;
			return this;
		}

		public UserBuilder isVerified(boolean isVerified)
		{
			this.isVerified=isVerified;
			return this;
		}

		public User build()
		{
			return new User(this);
		}
	}

	@Override
	public String toString() {
		return "User{" +
				"firstName='" + firstName + '\'' +
				", lastName='" + lastName + '\'' +
				", age=" + age +
				", phone='" + phone + '\'' +
				", address='" + address + '\'' +
				", email='" + email + '\'' +
				", isVerified=" + isVerified +
				'}';
	}
}