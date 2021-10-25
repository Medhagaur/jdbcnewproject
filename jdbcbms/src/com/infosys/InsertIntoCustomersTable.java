package com.infosys;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertIntoCustomersTable {
	public int getData(EmpDetails emp) {
		Connection connection = null;
		PreparedStatement statement = null;
		int update = 0;
		try {
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/education","root","Medhasharma@2125");
			statement = connection.prepareStatement("insert into customers values(?,?)");
			statement.setInt(1, emp.getCID());
			statement.setString(2, emp.getCNAME());
			
			update = statement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				statement.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return update;
	}
	

}
