package basic_call;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo_1 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/college", "root", "Omkarg@122");

		Statement state = con.createStatement();
		int i = state.executeUpdate("insert into student values(11,'John Snow',65.75)");
		System.out.println("1 Row is Affected: " + i);

//			Statement state_1 = con.createStatement();
//			int j = state_1.executeUpdate("update student set marks = 79.02 where marks = 79");
//			System.out.println("1 Row Updated " + j);

		state.close();
		con.close();
	}

}
