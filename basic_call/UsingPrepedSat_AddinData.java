package basic_call;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class UsingPrepedSat_AddinData {

	public static void main(String[] args) {

		try {

			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/college", "root", "Omkarg@122");

			PreparedStatement Pre = con.prepareStatement("insert into student values(?,?,?)");

			Scanner sc = new Scanner(System.in);

			for (int i = 0; i <= 2; i++) {

				System.out.println("Inter The ID");
				int id = sc.nextInt();
				sc.nextLine();

				System.out.println("Inter The Name");
				String Name = sc.nextLine();

				System.out.println("Inter The Marks");
				double Marks = sc.nextDouble();

				Pre.setInt(1, id);
				Pre.setString(2, Name);
				Pre.setDouble(3, Marks);

				Pre.executeUpdate();

			}
			sc.close();
			con.close();
			Pre.close();
			System.out.println("Data Inserted Succesfully");

		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
	}

}
