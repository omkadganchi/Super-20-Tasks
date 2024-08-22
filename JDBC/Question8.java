package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Question8 {
void authors(int id) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_super20","root","HareKrishna@!");
		

		PreparedStatement st = con.prepareStatement("delete from posts where id = ?");
	    st.setInt(1, id);
	    int a = st.executeUpdate();
	    System.out.println(a);

	    
	}
public static void main(String[] args) throws ClassNotFoundException, SQLException {
	Question8 q8 = new Question8();
	q8.authors(3);
}
	
}
