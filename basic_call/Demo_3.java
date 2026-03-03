package basic_call;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Demo_3 {

	public static void main(String[] args) throws SQLException {

		try

		{
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/college", "root", "Omkarg@122");

			PreparedStatement stmt = con.prepareStatement("select * from it_workers");
			ResultSet rs = stmt.executeQuery();

//			{
//			boolean r =	stmt.execute();
//			System.out.println(r);
//			}
			while (rs.next()) {
				System.out.println(rs.getInt("emp_id"));
				System.out.println(rs.getString("emp_name"));
				System.out.println(rs.getInt("salary"));
				System.out.println(rs.getString("department"));

				System.out.println("\n 📍____________▫️_________⚠️\n");
			}
			stmt.close();
			rs.close();
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
	}
}
