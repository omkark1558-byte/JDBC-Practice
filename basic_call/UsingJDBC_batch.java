package basic_call;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class UsingJDBC_batch {

	public static void main(String[] args) {

		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/college", "root", "Omkarg@122");

			con.setAutoCommit(false);

			Statement stmt = con.createStatement();

			stmt.addBatch("insert into it_workers values(12,'Virasat',89000,'IT_Pairs')");
			stmt.addBatch("insert into it_workers values(13,'Mahes SIR',750000,'IT_TRAINER')");

			stmt.executeBatch();
			con.commit();

			System.out.println("Data Inserted Successfully !");
			con.close();
			stmt.close();

		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}

	}

}
