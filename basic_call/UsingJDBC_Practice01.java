package basic_call;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UsingJDBC_Practice01 {

	public static void main(String[] args) throws SQLException {

		try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/college", "root",
				"Omkarg@122");) {

			Statement stmt = con.createStatement();
			int i = stmt.executeUpdate("insert into student value(16,'Yuvidester',89.45);");

			System.out.println("Row Affected: " + i);
			con.commit();
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}

	}

}