package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connector {
private static final String URL = "jdbc:oracle:thin:@localhost:1521:xe";
private static final String USER = "c##test";
private static final String PWD = "test";
private static Connection con;

private static void init() {
	try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
	} catch (ClassNotFoundException e) {
		e.printStackTrace();
	}
}
public static Connection getConnection() {
	if(con==null) {
		try {
			init();
			con = DriverManager.getConnection(URL,USER,PWD);
		}catch(SQLException e){
			e.printStackTrace();
		}
	}
	return con;
}
public static void close(){
	if(con!=null) {
		try {
			con.close();
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
	con = null;
}
public static void main(String[] args) {
	Connection con = getConnection();
//	createStatement().executeQuery("select * from board");
	
}
}
