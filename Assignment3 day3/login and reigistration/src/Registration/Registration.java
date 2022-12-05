package Registration;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Registration {
	
	static final String dburl="jdbc:mysql://localhost:3306/dummy";
	static final String user="root";
	 static final String pass="root";
	 static final String QUERY="insert into reg(fname,email,password) values(?,?,?);";
	 
	 
	 public static void main(String[] args) {
		 
		 try (Connection con=DriverManager.getConnection(dburl,user,pass);
					Statement st=con.createStatement();
				 PreparedStatement ptst=con.prepareStatement(QUERY);){
					 
		
					Scanner sc=new Scanner(System.in);
					 System.out.println("Enter First name");
					 String fname=sc.nextLine();
					 
					 System.out.println("Enter  email");
					 String email=sc.nextLine();
					System.out.println("Enter  password");
					 String pass=sc.nextLine();
					 
					 ptst.setString(1,fname);
					 ptst.setString(2,email);
					 
					 ptst.setString(3,pass);
					 ptst.executeUpdate();
					 
				 }
			catch(SQLException e)	 {
				
				System.out.println("Exception occured while inserting the data");
	 }

}}
