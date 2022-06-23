package com.xworkz.resort.dao;

import static com.xworkz.resort.constants.JdbcProperties.SECRET;
import static com.xworkz.resort.constants.JdbcProperties.URL;
import static com.xworkz.resort.constants.JdbcProperties.USERNAME;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.time.LocalTime;

import com.xworkz.resort.dto.ResortDTO;

public class ResortDAOImpl implements Serializable, ResortDAO {

	ResortDTO[] dtos = new ResortDTO[total_size];

	@Override
	public boolean save(ResortDTO dto) {
		String sql = "INSERT INTO resort VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

		try (Connection connection = DriverManager.getConnection(URL.getValue(), USERNAME.getValue(),
				SECRET.getValue())) {

			PreparedStatement prepar = connection.prepareStatement(sql);

			prepar.setInt(1, dto.getId());
			prepar.setString(2, dto.getName());
			prepar.setString(3, dto.getOwnerName());
			prepar.setString(4, dto.getLocation());
			prepar.setDouble(5, dto.getPrice());
			prepar.setInt(6, dto.getRating());
			prepar.setTime(7, Time.valueOf(dto.getCheckInTime()));
			prepar.setTime(8, Time.valueOf(dto.getCheckOutTime()));
			prepar.setInt(9, dto.getNoOfCooks());
			prepar.setString(10, dto.getReceptionistName());
			prepar.setInt(11, dto.getCottages());
			prepar.setInt(12, dto.getSecurityGuards());
			prepar.setBoolean(13, dto.getSwimmingPool());
			prepar.setInt(14, dto.getNoOfCCTV());
			prepar.setInt(15, dto.getNoOfDogs());
			prepar.setInt(16, dto.getNoOfJeeps());
			prepar.setInt(17, dto.getNoOfBikes());
			prepar.setBoolean(18, dto.getOnlineBooking());
			prepar.setString(19, dto.getState());
			prepar.setString(20, dto.getCountry());
			prepar.setDouble(21, dto.getInvestment());
			prepar.setInt(22, dto.getNoOfInvesters());
			prepar.setDouble(23, dto.getNetWorth());
			prepar.setBoolean(24, dto.getInternet());
			prepar.setInt(25, dto.getTotalArea());
			prepar.setInt(26, dto.getNoOfTrees());
			prepar.setBoolean(27, dto.getBarCounter());
			prepar.setBoolean(28, dto.getVegFood());
			prepar.setBoolean(29, dto.getNonVegFood());
			prepar.setString(30, dto.getTreeName());
			prepar.setInt(31, dto.getNoOfActivities());
			prepar.setBoolean(32, dto.getIndoorActivities());
			prepar.setBoolean(33, dto.getOutdoorActivities());
			prepar.setString(34, dto.getActivitiesName());
			prepar.setString(35, dto.getGstNo());
			prepar.setBoolean(36, dto.getAcRooms());
			prepar.setBoolean(37, dto.getFireChamp());
			prepar.setBoolean(38, dto.getAdvanceBooking());
			prepar.setBoolean(39, dto.getBookingCanclled());
			prepar.setDate(40, Date.valueOf(dto.getCreateDate()));
			prepar.setString(41, dto.getCreateBy());
			prepar.setDate(42, Date.valueOf(dto.getUpdateDate()));
			prepar.setString(43, dto.getUpdatedBy());

			int row = prepar.executeUpdate();
			System.out.println(row);
			return row == 1 ? true : false;

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public void updatePriceByName(String name, double price) {
		String sql = "UPDATE resort get price=? WHERE name=? ";
		try (Connection connection = DriverManager.getConnection(URL.getValue(), USERNAME.getValue(),
				SECRET.getValue())) {

			PreparedStatement result = connection.prepareStatement(sql);
			result.setDouble(1, price);
			result.setString(2, name);

			int rowUpdate = result.executeUpdate();
			System.out.println(rowUpdate);

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void updatePriceAndRatingByName(String name, int rating, double price) {
		String sql = "UPDATE resort get price=?,rating=? WHERE name=? ";
		try (Connection connection = DriverManager.getConnection(URL.getValue(), USERNAME.getValue(),
				SECRET.getValue())) {

			PreparedStatement result = connection.prepareStatement(sql);
			result.setDouble(1, price);
			result.setInt(2, rating);
			result.setString(3, name);

			int rowUpdate = result.executeUpdate();
			System.out.println(rowUpdate);

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	@Override
	public void updateReceptionistNameById(String name, int id) {
		String sql = "UPDATE resort get receptionstName=? WHERE id=? ";
		try (Connection connection = DriverManager.getConnection(URL.getValue(), USERNAME.getValue(),
				SECRET.getValue())) {

			PreparedStatement result = connection.prepareStatement(sql);
			result.setString(1, name);
			result.setInt(2, id);

			int rowUpdate = result.executeUpdate();
			System.out.println(rowUpdate);

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	@Override
	public ResortDTO getById(int id) {

		String sql = "SELECT * FROM resort WHERE id=? ";
		try (Connection connection = DriverManager.getConnection(URL.getValue(), USERNAME.getValue(),
				SECRET.getValue())) {
			PreparedStatement prepar = connection.prepareStatement(sql);
			prepar.setInt(1, id);

			ResultSet result = prepar.executeQuery();
			while (result.next()) {

				return getDTOResort(result);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return null;
	}

	@Override
	public ResortDTO getByName(String name) {

		String sql = "SELECT * FROM resort WHERE name=? ";
		try (Connection connection = DriverManager.getConnection(URL.getValue(), USERNAME.getValue(),
				SECRET.getValue())) {
			PreparedStatement prepar = connection.prepareStatement(sql);
			prepar.setString(1, name);

			ResultSet result = prepar.executeQuery();
			while (result.next()) {
				return getDTOResort(result);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return null;
	}

	@Override
	public ResortDTO getByNameAndLocation(String name, String location) {

		String sql = "SELECT * FROM resort WHERE name=? && location=? ";
		try (Connection connection = DriverManager.getConnection(URL.getValue(), USERNAME.getValue(),
				SECRET.getValue())) {
			PreparedStatement prepar = connection.prepareStatement(sql);
			prepar.setString(1, name);
			prepar.setString(2, location);

			ResultSet result = prepar.executeQuery();
			while (result.next()) {

				return getDTOResort(result);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return null;
	}

	private ResortDTO getDTOResort(ResultSet result) throws SQLException {
		ResortDTO dto = new ResortDTO();

		dto.setId(result.getInt(1));
		dto.setName(result.getString(2));
		dto.setOwnerName(result.getString(3));
		dto.setLocation(result.getString(4));
		dto.setPrice(result.getDouble(5));
		dto.setRating(result.getInt(6));

		Time checkInTime = result.getTime(7);
		dto.setCheckInTime(checkInTime.toLocalTime());
		Time checkOutTime = result.getTime(8);
		dto.setCheckOutTime(checkOutTime.toLocalTime());

		dto.setNoOfCooks(result.getInt(9));
		dto.setReceptionistName(result.getString(10));
		dto.setCottages(result.getInt(11));
		dto.setSecurityGuards(result.getInt(12));
		dto.setSwimmingPool(result.getBoolean(13));
		dto.setNoOfCCTV(result.getInt(14));
		dto.setNoOfDogs(result.getInt(15));
		dto.setNoOfJeeps(result.getInt(16));
		dto.setNoOfBikes(result.getInt(17));
		dto.setOnlineBooking(result.getBoolean(18));
		dto.setState(result.getString(19));
		dto.setCountry(result.getString(20));
		dto.setInvestment(result.getDouble(21));
		dto.setNoOfInvesters(result.getInt(22));
		dto.setNetWorth(result.getDouble(23));
		dto.setInternet(result.getBoolean(24));
		dto.setTotalArea(result.getInt(25));
		dto.setNoOfTrees(result.getInt(26));
		dto.setBarCounter(result.getBoolean(27));
		dto.setVegFood(result.getBoolean(28));
		dto.setNonVegFood(result.getBoolean(29));
		dto.setTreeName(result.getString(30));
		dto.setNoOfTrees(result.getInt(31));
		dto.setIndoorActivities(result.getBoolean(32));
		dto.setOutdoorActivities(result.getBoolean(33));
		dto.setActivitiesName(result.getString(34));
		dto.setGstNo(result.getString(35));
		dto.setAcRooms(result.getBoolean(36));
		dto.setFireChamp(result.getBoolean(37));
		dto.setAdvanceBooking(result.getBoolean(38));
		dto.setBookingCanclled(result.getBoolean(39));

		Date createDate = result.getDate(40);
		dto.setCreateDate(createDate.toLocalDate());
		dto.setCreateBy(result.getString(41));
		Date updateDate = result.getDate(42);
		dto.setUpdateDate(updateDate.toLocalDate());
		dto.setUpdatedBy(result.getString(43));

		return dto;
	}

	@Override
	public ResortDTO getByNameAndLocationAndOwnerName(String name, String location, String ownerName) {

		String sql = "SELECT * FROM resort WHERE name=? && location=? && ownerName=? ";
		try (Connection connection = DriverManager.getConnection(URL.getValue(), USERNAME.getValue(),
				SECRET.getValue())) {
			PreparedStatement prepar = connection.prepareStatement(sql);
			prepar.setString(1, name);
			prepar.setString(2, location);
			prepar.setString(3, ownerName);

			ResultSet result = prepar.executeQuery();
			while (result.next()) {

				return getDTOResort(result);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return null;
	}

	@Override
	public void save(ResortDTO[] dtos) {

		String sql = "INSERT INTO resort VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

		try (Connection connection = DriverManager.getConnection(URL.getValue(), USERNAME.getValue(),
				SECRET.getValue())) {

			PreparedStatement prepar = connection.prepareStatement(sql);
			ResortDTO dto = new ResortDTO();
			for (int i = 0; i < dtos.length; i++) {
				prepar.setInt(1, dto.getId());
				prepar.setString(2, dto.getName());
				prepar.setString(3, dto.getOwnerName());
				prepar.setString(4, dto.getLocation());
				prepar.setDouble(5, dto.getPrice());
				prepar.setInt(6, dto.getRating());
				prepar.setTime(7, Time.valueOf(dto.getCheckInTime()));
				prepar.setTime(8, Time.valueOf(dto.getCheckOutTime()));
				prepar.setInt(9, dto.getNoOfCooks());
				prepar.setString(10, dto.getReceptionistName());
				prepar.setInt(11, dto.getCottages());
				prepar.setInt(12, dto.getSecurityGuards());
				prepar.setBoolean(13, dto.getSwimmingPool());
				prepar.setInt(14, dto.getNoOfCCTV());
				prepar.setInt(15, dto.getNoOfDogs());
				prepar.setInt(16, dto.getNoOfJeeps());
				prepar.setInt(17, dto.getNoOfBikes());
				prepar.setBoolean(18, dto.getOnlineBooking());
				prepar.setString(19, dto.getState());
				prepar.setString(20, dto.getCountry());
				prepar.setDouble(21, dto.getInvestment());
				prepar.setInt(22, dto.getNoOfInvesters());
				prepar.setDouble(23, dto.getNetWorth());
				prepar.setBoolean(24, dto.getInternet());
				prepar.setInt(25, dto.getTotalArea());
				prepar.setInt(26, dto.getNoOfTrees());
				prepar.setBoolean(27, dto.getBarCounter());
				prepar.setBoolean(28, dto.getVegFood());
				prepar.setBoolean(29, dto.getNonVegFood());
				prepar.setString(30, dto.getTreeName());
				prepar.setInt(31, dto.getNoOfActivities());
				prepar.setBoolean(32, dto.getIndoorActivities());
				prepar.setBoolean(33, dto.getOutdoorActivities());
				prepar.setString(34, dto.getActivitiesName());
				prepar.setString(35, dto.getGstNo());
				prepar.setBoolean(36, dto.getAcRooms());
				prepar.setBoolean(37, dto.getFireChamp());
				prepar.setBoolean(38, dto.getAdvanceBooking());
				prepar.setBoolean(39, dto.getBookingCanclled());
				prepar.setDate(40, Date.valueOf(dto.getCreateDate()));
				prepar.setString(41, dto.getCreateBy());
				prepar.setDate(42, Date.valueOf(dto.getUpdateDate()));
				prepar.setString(43, dto.getUpdatedBy());

				int row = prepar.executeUpdate();
				System.out.println(row);
				// return row == 1 ? true : false;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	@Override
	public LocalTime getCheckInTimeByName(String name) {
		String JDBC = "SELECT checkInTime FROM Resort WHERE name=?;";

		try (Connection connection = DriverManager.getConnection(URL.getValue(), USERNAME.getValue(),
				SECRET.getValue())) {

			PreparedStatement preparedStatement = connection.prepareStatement(JDBC);
			preparedStatement.setString(1, name);

			ResultSet resultSet = preparedStatement.executeQuery();

			while (resultSet.next()) {

				Time entryTime = resultSet.getTime(1);
				LocalTime time = entryTime.toLocalTime();

				return time;

			}

		} catch (SQLException e) {

			e.printStackTrace();
		}
		return null;

	}

	@Override
	public int getTotalRows() {

		String JDBC = "SELECT count(*) from Resort;";

		try (Connection connection = DriverManager.getConnection(URL.getValue(), USERNAME.getValue(),
				SECRET.getValue())) {

			PreparedStatement prepar = connection.prepareStatement(JDBC);
			ResultSet result = prepar.executeQuery();
			while (result.next()) {
				int id = result.getInt(1);
				return id;
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return 0;
	}

	@Override
	public ResortDTO getByMaxPrice() {

		String JDBC = "SELECT * FROM Resort where price = (select max(price) from Resort);";

		try (Connection connection = DriverManager.getConnection(URL.getValue(), USERNAME.getValue(),
				SECRET.getValue())) {

			PreparedStatement preparedStatement = connection.prepareStatement(JDBC);
			ResultSet result = preparedStatement.executeQuery();
			while (result.next()) {

				return getDTOResort(result); // used refactor method
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public ResortDTO getByMinPrice() {

		String JDBC = "SELECT * FROM Resort where price = (select min(price) from Resort);";

		try (Connection connection = DriverManager.getConnection(URL.getValue(), USERNAME.getValue(),
				SECRET.getValue())) {

			PreparedStatement preparedStatement = connection.prepareStatement(JDBC);
			ResultSet result = preparedStatement.executeQuery();
			while (result.next()) {

				return getDTOResort(result); // used refactor method
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

}
