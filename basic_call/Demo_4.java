package basic_call;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo_4 {

	public static void main(String[] args) throws SQLException {

		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/college", "root", "Omkarg@122");
		Statement st = con.createStatement();

		int rows = st.executeUpdate("insert into student values(15,'JS Kiraj',25.50)");

		System.out.println("Row Affected: "+rows);
		System.out.println("Connection Opened...!");

		con.close();
		st.close();
	}

}
