package com.xworkz.malnadu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Apartment {

	public static void main(String[] args) {
		
		String url = "jdbc:mysql://localhost:3306/xworkzodc";
		String username = "root";
		String password = "Xworkzodc@123";
		try (Connection connection = DriverManager.getConnection(url, username, password)) {
			System.out.println(connection);

			String apt1 = "INSERT into apartment values(1,'Varada Apartments','Bengaluru','BTM',100,15,123,2,7500,'99837373','9827383738',1,0);";
			String apt2 = "INSERT into apartment values(2,'Sanjay Apartments','Mangalore','KSRTC busstop',100,15,123,2,7500,'99837374','9827383737',1,0);";
			String apt3 = "INSERT into apartment values(3,'Suhas Apartments','Shivamogga','JNNCE college',100,15,123,2,7500,'99837375','9827383736',1,0);";
			String apt4 = "INSERT into apartment values(4,'Prateek Apartments','Belgaum','VTU',100,15,123,2,7500,'99837376','9827383736',1,0);";
			String apt5 = "INSERT into apartment values(5,'Shwetha Apartments','Goa','Church',100,15,123,2,7500,'99837377','9827383734',1,0);";

			Statement statement = connection.createStatement();
			int ref = statement.executeUpdate(apt1);
			System.out.println(ref);
			int ref1 = statement.executeUpdate(apt2);
			System.out.println(ref1);
			int ref2 = statement.executeUpdate(apt3);
			System.out.println(ref2);
			int ref3 = statement.executeUpdate(apt4);
			System.out.println(ref3);
			int ref4 = statement.executeUpdate(apt5);
			System.out.println(ref4);

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
