package com.project3.objectpool;

public class Main1
{
	public static void main(String[] args)
	{
		DBConnectionPool dbConnectionPool=new DBConnectionPool();
		DBConnection connection1=dbConnectionPool.getConnection();
		DBConnection connection2=dbConnectionPool.getConnection();

		connection1.query("SELECT * FROM USERS");
		connection2.query("UPDATE products SET price=500");

		dbConnectionPool.releaseConnection(connection1);

		DBConnection connection3=dbConnectionPool.getConnection();
		connection3.query("DELETE FROM orders WHERE id=10");

		dbConnectionPool.releaseConnection(connection2);
		dbConnectionPool.releaseConnection(connection3);
	}
}