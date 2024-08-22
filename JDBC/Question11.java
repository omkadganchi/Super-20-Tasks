package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Question11 {
	void authors(String Title) throws ClassNotFoundException, SQLException {

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_super20", "root", "root");
		PreparedStatement st = con.prepareStatement("select * from posts where title like' ?%' ");
		st.setString(1, Title);
		ResultSet a = st.executeQuery();
		while (a.next()) {
			System.out.println(
					a.getInt(1) + a.getInt(2) + a.getString(3) + a.getString(4) + a.getString(5) + a.getString(6));
		}
	}

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Question11 q11 = new Question11();
		q11.authors("description");

	}

}
