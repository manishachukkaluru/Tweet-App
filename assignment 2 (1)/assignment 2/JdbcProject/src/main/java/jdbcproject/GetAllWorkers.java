package jdbcproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class GetAllWorkers {
	
	private static String url = "jdbc:mysql://localhost:3306/worker";
	private static String username = "root";
	private static String password = "pass@word1";  
	private static String querry = "select * from workers";
	
	public static void main(String[] args) throws Exception {
		  
		  PreparedStatement ps = null;
		  Connection con = null;
		  Scanner sc = new Scanner(System.in);
		  ResultSet rs =null;
		  
		  try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				con = DriverManager.getConnection(url, username, password);
				ps = con.prepareStatement(querry);
				rs = ps.executeQuery();
				
				while(rs.next()) {
					
					System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getLong(4)+" "+rs.getString(5)+" "+rs.getString(6));
				}
				
			} catch (Exception e) {
				throw new Exception("Some thing wrong while fetching a data");
			}

	   }
}
