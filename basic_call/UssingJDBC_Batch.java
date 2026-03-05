package basic_call;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UssingJDBC_Batch {

	public static void main(String[] args) throws SQLException {

		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/college", "root", "Omkarg@122");

			Statement sc = con.createStatement();
			int i = sc.executeUpdate("insert into student values(16,'Nandakshor',55500)");
			System.out.println("Row Affected: " + i);
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
	}

}
