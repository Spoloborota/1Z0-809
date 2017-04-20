package com.spoloborota.ocp.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class JDBCTest {

	public static void main(String[] args) throws SQLException {
		Properties p = new Properties();   
		p.setProperty("user", "");   
		p.setProperty("password", "");   
		Connection c =  DriverManager.getConnection("", p);     
	}

}
