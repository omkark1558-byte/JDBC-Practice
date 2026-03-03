package basic_call;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertingSQLdata_UsingStatement {

	public static void main(String[] args) throws SQLException {

		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/college", "root", "Omkarg@122");

			Statement st = con.createStatement();

			int sc = st.executeUpdate("update it_workers set emp_id = 11 where emp_id =1");
			System.out.println("! Row Affected : " + sc);

			Statement sc_1 = con.createStatement();
			int ty = sc_1.executeUpdate("insert into student values(10,'SWARAJYA',68.45)");
			System.out.println("Second Row Updated: " + ty);

		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
