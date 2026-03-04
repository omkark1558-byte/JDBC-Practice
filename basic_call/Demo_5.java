package basic_call;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Demo_5 {

	public static void main(String[] args) throws SQLException {

		// Write the Dynamic Queries

		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/college", "root", "Omkarg@122");

		Scanner sc = new Scanner(System.in);

		System.out.println("Inter The ID");
		int id = sc.nextInt();

		System.out.println("Inter The Name");
		String Name = sc.next();

		System.out.println("Inter The Marks");
		double Marks = sc.nextDouble();

		PreparedStatement Ref = con.prepareStatement("insert into student values(?,?,?);");

		Ref.setInt(1, id);
		Ref.setString(2, Name);
		Ref.setDouble(3, Marks);

		System.out.println("No Of Affected: " + Ref.executeUpdate());

		con.close();
		Ref.close();
		sc.close();
	}

}