package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Question9 {

	void authors(int id) throws ClassNotFoundException, SQLException {

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_super20", "root","root");

		PreparedStatement st = con.prepareStatement("select * from authors ");

		st.setInt(1, id);

		int a = st.executeUpdate();
		System.out.println(a);

	}

}
