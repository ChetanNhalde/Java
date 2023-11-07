package utils;

import java.sql.*;

public class DBUtils {
	
	public static Connection openConnection()throws ClassNotFoundException,SQLException {
		//1.load jdbc driver (Type 4) (Pure Java) Optional
		
//		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//2. Get a connection to DB
		//API: java.sql.DriverManager : Class
		//Method public static Connection getConnection(String dbURL, String username, String pass)
		//throws SqlException
		
		String dbURL = "jdbc:mysql://localhost:3306/advjava?useSSL=false&allowPublicKeyRetrieval=true";
		return DriverManager.getConnection(dbURL,"root","root123");
		
		
		
		
	}

}
