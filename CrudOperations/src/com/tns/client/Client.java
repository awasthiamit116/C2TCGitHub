package com.tns.client;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.tns.util.DButil;

public class Client 
{
	public static void main(String[] args) throws SQLException {
		
		Connection connection = DButil.getConnection();
		if(connection!=null)
		{
			System.out.println("JDBC: connection is established");
		}
//		addEmployee();
//		updateEmployee();
//		deleteEmployee();
//		getEmployee();
		getAllEmployee();
	}
	
	
	// ADD EMPLOYEE
	
	private static void addEmployee() throws SQLException
	{
		Connection connection = DButil.getConnection();
		Statement stmt = connection.createStatement();
		String sqlinsert = "INSERT INTO EMPLOYEE(EmpId, EmpName, EmpAge, EmpDept)"+"values(4,'XYZ',36,10)";
		int executeupdate = stmt.executeUpdate(sqlinsert);
		if(executeupdate==1)
		{
			System.out.println("Entry is added");
		}
	}
	
	
//	UPDATE EMPLOYEE
	
	private static void updateEmployee() throws SQLException
	{
		Connection connection = DButil.getConnection();
		Statement stmt = connection.createStatement();
		String sqlupdate = "UPDATE EMPLOYEE SET EmpName = 'Ishita' WHERE EmpId =4";
		int executeupdate = stmt.executeUpdate(sqlupdate);
		if(executeupdate==1)
		{
			System.out.println("Entry is updated");
		}
	}
	
	
//	DELETE EMPLOYEE
	
	private static void deleteEmployee() throws SQLException
	{
		Connection connection = DButil.getConnection();
		Statement stmt = connection.createStatement();
		String sqldelete = "DELETE FROM employee where EmpId=4";
		int executeupdate = stmt.executeUpdate(sqldelete);
		if(executeupdate==1)
		{
			System.out.println("Entry is Deleted");
		}
	}
	
	
//	RETRIEVE EMPLOYEE
	
	private static void getEmployee() throws SQLException
	{
		Connection connection = DButil.getConnection();
		Statement stmt = connection.createStatement();
		String sqlretrieve = "SELECT * FROM employee WHERE EmpId=4";
//		int executeupdate = stmt.executeUpdate(sqldelete);
		ResultSet rs = stmt.executeQuery(sqlretrieve);
		if(rs.next())
		{
			int EmpId = rs.getInt("EmpId");
			String EmpName = rs.getString("EmpName");
			int EmpAge  = rs.getInt("EmpAge");
			int EmpDept = rs.getInt("EmpDept");
			System.out.println(EmpId+" "+EmpName+" "+EmpAge+" "+EmpDept);
		}
		else
		{
			System.out.println("No Result Found");
		}
	}
	
	
//	RETRIEVE ALL EMPLOYEE
	
	private static void getAllEmployee() throws SQLException
	{
		Connection connection = DButil.getConnection();
		Statement stmt = connection.createStatement();
		String sqlretrieve = "SELECT * FROM employee";
//		int executeupdate = stmt.executeUpdate(sqldelete);
		ResultSet rs = stmt.executeQuery(sqlretrieve);
		while(rs.next())
		{
			int EmpId = rs.getInt("EmpId");
			String EmpName = rs.getString("EmpName");
			int EmpAge  = rs.getInt("EmpAge");
			int EmpDept = rs.getInt("EmpDept");
			System.out.println(EmpId+" "+EmpName+" "+EmpAge+" "+EmpDept);
		}
		
	}
	
}
