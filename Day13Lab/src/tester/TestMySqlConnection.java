package tester;
import java.sql.*;
import static utils.DBUtils.openConnection;

public class TestMySqlConnection {
	public static void main(String[] args) {
		try(Connection cn = openConnection()) {
			
			System.out.println("Connected to database" + cn);
			
			
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
