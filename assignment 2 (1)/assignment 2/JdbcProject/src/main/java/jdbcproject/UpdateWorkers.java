package jdbcproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class UpdateWorkers {
	
	private static String url = "jdbc:mysql://localhost:3306/worker";
	private static String username = "root";
	private static String password = "pass@word1";  
	private static String querry = "update workers set first_name=?, last_name=?,department=? where worker_id=?";
 
	
  public static void main(String[] args) throws Exception {
	  
	  PreparedStatement ps = null;
	  Connection con = null;
	  Scanner sc = new Scanner(System.in);
	  System.out.println("Enter Worker Id");
	  int woker_id = sc.nextInt();
	  System.out.println("Enter first name");
	  String first_name = sc.next();
	  System.out.println("Enter Last name");
	  String last_name = sc.next();
	  System.out.println("Enter department");
	  String department = sc.next();

	  
	  try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(url, username, password);
			ps = con.prepareStatement(querry);
			ps.setInt(4,woker_id);
			ps.setString(1,first_name);
			ps.setString(2,last_name);
			ps.setString(3,department);
			int code = ps.executeUpdate();
		    if(code !=0) {
		      System.out.println("Data updated suceesfully");
		    }
		} catch (Exception e) {
			throw new Exception("While inserting a data in table an error occurs");
	
		}
  }
}
