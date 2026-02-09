package com.project3.objectpool;

public class DBConnection
{
	private int id;
	public DBConnection(int id)
	{
		this.id=id;
		System.out.println("Creating DB Connection: "+id);
	}

	public void query(String sql)
	{
		System.out.println("Connection Id: "+id+" executing SQL: "+sql);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}