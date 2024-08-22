package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Question4 {
void authors(int id) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_super20","root","root");
		
        System.out.println("check1");
		PreparedStatement st = con.prepareStatement("delete from authors where id =?");
	    st.setInt(1, id);

	    int d = st.executeUpdate();
	    System.out.println(d);
	    
    		
	    
	}
public static void main(String[] args) throws ClassNotFoundException, SQLException {
	Question4 q4 = new Question4();
	q4.authors(2);
}
}
