package Programs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbcConnectionDemo {

	
	
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://https://www.db4free.net//resurrectiondb","resurrection","resurrection");
		if(con!=null) {
			
			System.out.println();
		}
		
		else {
			
			System.out.println();
		}
		
		Statement stmt=con.createStatement();
		
		String s="INSERT INTO demo (`emp_id`, `name`, `location`, `role`) VALUES ('102', 'amit', '13', '13')";
		
		stmt.execute(s);
		con.close();
		
				
				//String url = "jdbc:mysql://HOST/DATABASE";
		 // conn = DriverManager.getConnection(url, "username", "password");
				
				//conn = DriverManager.getConnection(url, "username", "password");
				
				//INSERT INTO `demo` (`emp_id`, `name`, `location`, `role`) VALUES ('101', 'sumit', '12', '12');
				//SELECT * FROM `demo`
	}
}


