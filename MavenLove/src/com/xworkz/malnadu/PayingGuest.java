package com.xworkz.malnadu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class PayingGuest {

	public static void main(String[] args) {
		
		String url = "jdbc:mysql://localhost:3306/xworkzodc";
		String userName = "root";
		String password = "Xworkzodc@123";
		try (Connection connection = DriverManager.getConnection(url, userName, password)) {
			System.out.println(connection);
			String guest = "INSERT INTO Paying_Guest VALUES(2,'Shweta',25,'Female','Developer','BTM',"
					+ "'Bengaluru','Karnataka',1,9876983210,'Accenture','Diary Circle',560089,25,5000,100,500);";

			String guest1 = "INSERT INTO Paying_Guest VALUES(3,'Ranju',24,'Female','Sports','BTM',"
					+ "'Bengaluru','Karnataka',1,9876983210,'Accenture','Diary Circle',560089,25,5000,100,500);";

			String guest2 = "INSERT INTO Paying_Guest VALUES(4,'Saraswati',22,'Female','Developer','BTM',"
					+ "'Bengaluru','Karnataka',1,9876983210,'IBM','Marthalli',560079,25,7500,100,500);";

			String guest3 = "INSERT INTO Paying_Guest VALUES(5,'Rashmi',22,'Female','Scientist','BTM',"
					+ "'Bengaluru','Karnataka',1,9876983210,'ISRO','Ashok Nagar',560098,25,7500,100,500);";

			Statement statement = connection.createStatement();
			int reg = statement.executeUpdate(guest);
			System.out.println(reg);
			int reg1 = statement.executeUpdate(guest1);
			System.out.println(reg1);
			int reg2 = statement.executeUpdate(guest2);
			System.out.println(reg2);
			int reg3 = statement.executeUpdate(guest3);
			System.out.println(reg3);
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
