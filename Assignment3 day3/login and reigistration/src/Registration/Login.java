package Registration;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Login {

	static final String dburl="jdbc:mysql://localhost:3306/dummy";
	static final String user="root";
	 static final String pass="root";
	 static final String QUERY="select*from reg where email=? AND password d=?;";
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 try (Connection con=DriverManager.getConnection(dburl,user,pass);
					Statement st=con.createStatement();
				 PreparedStatement ptst=con.prepareStatement(QUERY);){
			 Scanner sc=new Scanner(System.in);
			 
			 
			 
			 System.out.println("Enter  email");
			 String email=sc.nextLine();
			 
			 
			 System.out.println("Enter  pass");
			 String pass=sc.nextLine();
			 
			 ResultSet rs=ptst.executeQuery();
			 if(rs.next()) {
				 System.out.println("login success");
				 
			 }
			 else {
				 System.out.println("login fail"); 
			 }
		 }
		 
		 catch(SQLException e) {
		
		
System.out.println("Exception occured");
	}

}}
