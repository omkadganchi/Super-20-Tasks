package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Question5 {

	void authors(int id,int author_id,String title,String discription,String content,String date) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_super20","root","root");

		PreparedStatement st = con.prepareStatement("insert into posts (id,author_id,title,description,content,date) Values (?,?,?,?,?,?)");
	    
	    st.setInt(1, id);
	    st.setInt(2, author_id);
	    st.setString(3, title);
	    st.setString(4, discription);
	    st.setString(5, content);
	    st.setString(6, date);
	    int e = st.executeUpdate();
	    System.out.println(e);

	    
	}
	
public static void main(String[] args) throws ClassNotFoundException, SQLException {
	Question5 q5 = new Question5();
	q5.authors(2, 2,"Second Post", "Description of second post", "Content of second post", "2024-06-05");
}

}