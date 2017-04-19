package com.spoloborota.ocp.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Savepoint;
import java.sql.Statement;

public class ColumnMeta {
	public static void main(String[] args) throws SQLException {

		Connection c = DriverManager.getConnection("jdbc:derby://localhost:1527/sample", "app", "app");
		try(Statement stmt = c.createStatement();) {
			ResultSet rs = stmt.executeQuery("select * from STUDENT");
			ResultSetMetaData rsmd = rs.getMetaData();
			int cc = rsmd.getColumnCount();
			while(rs.next()){
				for(int i = 0; i<cc; i++){
					System.out.print(rsmd.getColumnName(i)+" = "+rs.getObject(i+1)+", ");
				}
				System.out.println();
			}

		}
		catch(SQLException e){
			e.printStackTrace();
		}
		
        try (Connection c2 = DriverManager.getConnection("jdbc:derby://localhost:1527/sample", "app", "app");) {
            c2.setAutoCommit(false);
            Statement stmt = c2.createStatement();
            int a1 = stmt.executeUpdate("insert into STUDENT2 values (1, 'aaa', 1.1)");
            Savepoint sp1 = c2.setSavepoint();
            int a2 = stmt.executeUpdate("insert into STUDENT2 values (2, 'bbb', 2.1)");
            c2.rollback();
            int a3 = stmt.executeUpdate("insert into STUDENT2 values (3, 'ccc', 3.1)");
            c2.setAutoCommit(true);
            int a4 = stmt.executeUpdate("insert into STUDENT2 values (4, 'ddd', 4.1)");
        } catch (SQLException e) {
            e.printStackTrace();
        }
	}
}
