package basic_call;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Demo_ {

	public static void main(String[] args) throws SQLException {

		try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/college", "root", "Omkarg@122");

				PreparedStatement task = con
						.prepareStatement("insert into it_workers values(7,'Aniket',65000,'IT_Sector')");) {
			{
				boolean flag = task.execute();

				if (flag) {
					ResultSet ti = task.getResultSet();
					while (ti.next()) {
						System.out.println("DQL");
						System.out.println(ti.getInt(1));
						System.out.println(ti.getString(2));
						System.out.println(ti.getInt(3));
						System.out.println(ti.getString(4));
						System.out.println("-----------------");
					}
				} else {
					System.out.println("DML");
					int i = task.getUpdateCount();
					System.out.println("Number Of Affected: " + i);
				}

			}

		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}

	}

}

// insert into it_workers values7,"Aniket",65000,"IT_Sector";
