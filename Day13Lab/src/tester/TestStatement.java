package tester;
import java.sql.*;
import static utils.DBUtils.openConnection;

public class TestStatement {
	public static void main(String[] args) {
		try(Connection cn = openConnection();
				//create empty statement object to hold queries
				//API of connection i/f: Statment createStatment() throws SqlException
				Statement st = cn.createStatement();
				
				//3.exec select query
				//API: public ResultSet executeQuery(String sql)
				ResultSet rs = st.executeQuery("SELECT * FROM users");
				) {
			
			
			while(rs.next()) {
				//read row data using column position
				System.out.printf("TD %d name %s %s Email %s DOB %s Status %b Role %s %n",rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),
						rs.getString(6),rs.getBoolean(7),rs.getString(8));
			}
			System.out.println("Connected to database" + cn);
			
			
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
