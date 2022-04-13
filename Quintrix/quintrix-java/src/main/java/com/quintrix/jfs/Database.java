package com.quintrix.jfs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Database {
	// main code
	public static void main(String[] args) throws Exception {
		createTable();
		post();
	}
	
	// establish a connection to the database
	public static Connection getConnection() throws Exception{
		try {
			String driver = "com.mysql.jdbc.Driver";
			String url = "jdbc:mysql://localhost:3306/vending_machine";
			String username = "root";
			String password = "root";
			Class.forName(driver);
			
			Connection conn = DriverManager.getConnection(url,username,password);
			System.out.println("You Are Connected");
			return conn;
		} catch(Exception e) {System.out.println(e);}
		
		return null;
		
	}

	// creates table
	public static void createTable() throws Exception {
		try { 
				Connection con = getConnection();
				PreparedStatement create = con.prepareStatement(
						"CREATE TABLE IF NOT EXISTS Items"
						+ "(id int NOT NULL AUTO_INCREMENT,"
						+ "I_name TEXT(30) NOT NULL,"
						+ "Quantity INT NOT NULL,"
						+ "Price DECIMAL(4,2) NOT NULL,"
						+ "PRIMARY KEY (id))"
						);
				create.executeUpdate();
			
		}catch(Exception e) {System.out.println(e);}
		finally {System.out.println("Query Completed");}
	}
	
	//Insert into table
	public static void post() throws Exception {
		try {
		// establish a connection to the database
		Connection pro = getConnection();
		
		String insertStr = "INSERT INTO Items (I_name, Quantity, Price) VALUES (?,?,?)";
		
		// Create scanner 
		Scanner uInput = new Scanner(System.in);
		
		// Gets Snack name
		System.out.println("Enter Snack name");
		String snackName = uInput.nextLine();
		
		// Gets Quantity
		System.out.println("What is the Quantity of this item?");
		int quantity = uInput.nextInt();
		
		// Gets Price
		System.out.println("How much is this item [format 0.00]");
		float price = uInput.nextFloat();
		
		// Create insert Query
		PreparedStatement insertTable = pro.prepareStatement(insertStr);
		insertTable.setString(1, snackName);
		insertTable.setInt(2, quantity);
		insertTable.setFloat(3, price);
		
		// Sends data to table
		insertTable.executeUpdate();
		
		} catch(Exception e) {System.out.println(e);}
		finally {System.out.println("Successfully inserted into table");}
	}
}
