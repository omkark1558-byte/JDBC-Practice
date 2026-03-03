package basic_call;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Demo_1 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		 
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		
			Connection con  = DriverManager.getConnection("jdbc:mysql://localhost:3306/college", "root", "Omkarg@122");
			
			
			System.out.println("onjnskjfkjsanf");
			con.close();
					}

}
