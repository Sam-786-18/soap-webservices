package com.nareshit.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
static {
	try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
	}
	catch(ClassNotFoundException cnf){
		System.out.println("Execption Occured while loading the driver class:"+cnf.getMessage());
	}
}
public static Connection getConnection()throws SQLException{
	String url="jdbc:oracle:thin:@localhost:1521:XE";
	String un="system";
	String pw="tiger";
	Connection con=DriverManager.getConnection(url,un,pw);
	return con;
}
}
