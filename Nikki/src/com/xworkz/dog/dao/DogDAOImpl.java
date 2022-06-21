package com.xworkz.dog.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.xworkz.dog.dto.DogDTO;
import static com.xworkz.dog.constants.JDBCProperties.*;

public class DogDAOImpl implements DogDAO {

	@Override
	public boolean save(DogDTO dogDTO) {

		String jdbc = "INSERT INTO dogdetails VALUES(?,?,?,?,?,?,?,?,?)";
		try (Connection connection = DriverManager.getConnection(URL.getValue(), USERNAME.getValue(),
				SECRET.getValue())) {

			PreparedStatement prepar = connection.prepareStatement(jdbc);
			prepar.setInt(1, dogDTO.getId());
			prepar.setString(2, dogDTO.getBreed());
			prepar.setString(3, dogDTO.getColor());
			prepar.setDouble(4, dogDTO.getPrice());
			prepar.setString(5, dogDTO.getName());
			prepar.setDouble(6, dogDTO.getHeight());
			prepar.setDouble(7, dogDTO.getWeight());
			prepar.setString(8, dogDTO.getGender().toString());
			prepar.setDouble(9, dogDTO.getBirthDate().toEpochDay());

			int row = prepar.executeUpdate();
			return row == 1 ? true : false;

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return false;
	}

}
