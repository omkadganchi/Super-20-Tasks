package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Question7 {

	void authors(int id, String title, String discription) throws ClassNotFoundException, SQLException {

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_super20", "root","root");

		PreparedStatement st = con.prepareStatement("update posts set title = ?,description= ? where id = ?");
		st.setInt(3, id);
		st.setString(1, title);
		st.setString(2, discription);

		int a = st.executeUpdate();
		System.out.println(a);

	}

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Question7 q7 = new Question7();
		q7.authors(5, "Updated tile", "Updated Disciption");
	}

}
