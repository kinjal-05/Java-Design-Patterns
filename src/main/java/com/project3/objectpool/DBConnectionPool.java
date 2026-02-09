package com.project3.objectpool;

import java.util.ArrayList;
import java.util.List;

public class DBConnectionPool
{
	private List<DBConnection>availableConnections=new ArrayList<>();
	private List<DBConnection>usedConnections=new ArrayList<>();
	private static final int INITIAL_POOL_SIZE=3;

	public DBConnectionPool()
	{
		for(int i=1;i<=INITIAL_POOL_SIZE;i++)
		{
			availableConnections.add(new DBConnection(i));
		}
	}

	public synchronized  DBConnection getConnection()
	{
		if(availableConnections.isEmpty())
		{
			System.out.println("No Available Connection");
			return null;
		}

		DBConnection connection=availableConnections.remove(0);
		usedConnections.add(connection);
		System.out.println("Borrowed Connection: "+connection.getId());
		return connection;
	}


	public synchronized void releaseConnection(DBConnection connection)
	{
		usedConnections.remove(connection);
		availableConnections.add(connection);
		System.out.println("Returned Connection: "+connection.getId());
	}
}