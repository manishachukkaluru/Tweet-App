package jdbcproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class DeleteWorkerById {
	private static String url = "jdbc:mysql://localhost:3306/worker";
	private static String username = "root";
	private static String password = "pass@word1";  
	private static String querry = "delete from workers where worker_id=?";
	
	public static void main(String[] args) throws Exception {
		  
		  PreparedStatement ps = null;
		  Connection con = null;
		  Scanner sc = new Scanner(System.in);
		  System.out.println("Enter Worker Id");
		  int woker_id = sc.nextInt();
		  try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				con = DriverManager.getConnection(url, username, password);
				ps = con.prepareStatement(querry);
				ps.setInt(1, woker_id);
				int code = ps.executeUpdate();
				if(code !=0) {
					      System.out.println("Data deleted suceesfully");
					}
				
			} catch (Exception e) {
			throw new Exception("Some thing wrong while deleting a data");
			
			}
	}
}
