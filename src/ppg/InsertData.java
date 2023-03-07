package ppg;
import java.sql.*;
public class InsertData {
    String url = "jdbc:mysql://localhost:3306/registration";
  	String username = "root";
  	String password = "Vengadesh#27";
  	String query = "insert into details values(null,?,?,?,?,?,'online',?,null,?)";	
public void insert() throws SQLException {
	
	 Connection con = DriverManager.getConnection(url , username , password);
	 PreparedStatement pst = con.prepareStatement(query);
			
	 pst.setString(1, MainScreen.name);
	 pst.setString(2, MainScreen.collage);
	 pst.setString(3, MainScreen.location);
	 pst.setString(4, MainScreen.mobile);
	 pst.setString(5, MainScreen.email);
	 pst.setInt(6, MainScreen.amount);
	 pst.setString(7, MainScreen.gender);
	 pst.executeUpdate();
   }

public int calAmount() throws SQLException 
     {
	 String query1 = " select sum(Amount)from details";
	 int sum = 0;
	 Connection con = DriverManager.getConnection(url , username , password);
	 Statement st = con.createStatement();
	 ResultSet rs = st.executeQuery(query1);
	 while(rs.next()) 
	 {
		 int c = rs.getInt(1);
		 sum+=c;
	 }
	 return sum;
   }
}
