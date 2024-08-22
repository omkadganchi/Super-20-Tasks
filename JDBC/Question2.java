package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Question2 {
	void authors(String email) throws ClassNotFoundException, SQLException {

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_super20", "root", "root");

		PreparedStatement st = con.prepareStatement("select * from authors  where email =?");

		st.setString(1, email);
		ResultSet b = st.executeQuery();

		while (b.next()) {
			System.out.println(
					b.getInt(1) + b.getString(2) + b.getString(3) + b.getString(3) + b.getString(4) + b.getString(5));

		}

	}

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Question2 qs = new Question2();
		qs.authors("priya.patel@example.com");

	}

}
