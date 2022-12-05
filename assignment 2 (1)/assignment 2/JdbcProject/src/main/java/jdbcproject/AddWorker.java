package jdbcproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;


public class AddWorker {
	
	private static String url = "jdbc:mysql://localhost:3306/worker";
	private static String username = "root";
	private static String password = "pass@word1";  
	private static String querry = "insert into workers(worker_id,first_name,last_name,salary,joining_date,department) values (?,?,?,?,?,?);";
 
	
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
	  System.out.println("Enter salary");
	  Long salary = sc.nextLong();
	  System.out.println("Enter department");
	  String department = sc.next();

	   DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	   Date date = new Date();
	   String datetime = dateFormat.format(date);
	  
	  try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(url, username, password);
			ps = con.prepareStatement(querry);
			ps.setInt(1,woker_id);
			ps.setString(2,first_name);
			ps.setString(3,last_name);
			ps.setLong(4,salary);
			ps.setString(5,datetime);
			ps.setString(6,department);
			int code = ps.executeUpdate();
		    if(code !=0) {
		      System.out.println("Data inserted suceesfully");
		    }
		} catch (Exception e) {
			throw new Exception("While inserting a data in table an error occurs");
		}

   }

}
