package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Question1 {
	void authors(int id, String username, String lastname, String email, String date)
			throws ClassNotFoundException, SQLException {

		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/super_20_jdbc", "root", "root");
		PreparedStatement st = con
				.prepareStatement("insert into authors (id,first_name,last_name,email,birthdate) Values (?,?,?,?,?)");

		st.setInt(1, id);
		st.setString(2, username);
		st.setString(3, lastname);
		st.setString(4, email);
		st.setString(5, date);
		int a = st.executeUpdate();
		System.out.println(a);

	}

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Question1 task1 = new Question1();
		task1.authors(1, "Om", "Kadganchi", "om015kadganchi@gmail.com", "2002-12-03");

	}

}
