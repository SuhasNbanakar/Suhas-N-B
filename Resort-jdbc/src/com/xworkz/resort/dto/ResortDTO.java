package com.xworkz.resort.dto;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResortDTO implements Serializable {

	private Integer id;
	private String name;
	private String ownerName;
	private String location;
	private Double price;
	private Integer rating;
	private LocalTime checkInTime;
	private LocalTime checkOutTime;
	private Integer noOfCooks;
	private String receptionistName;
	private Integer cottages;
	private Integer securityGuards;
	private Boolean swimmingPool;
	private Integer noOfCCTV;
	private Integer noOfDogs;
	private Integer noOfJeeps;
	private Integer noOfBikes;
	private Boolean onlineBooking;
	private String state;
	private String country;
	private Double investment;
	private Integer noOfInvesters;
	private Double netWorth;
	private Boolean Internet;
	private Integer totalArea;
	private Integer noOfTrees;
	private Boolean barCounter;
	private Boolean vegFood;
	private Boolean nonVegFood;
	private String treeName;
	private Integer noOfActivities;
	private Boolean indoorActivities;
	private Boolean outdoorActivities;
	private String activitiesName;
	private String gstNo;
	private Boolean acRooms;
	private Boolean fireChamp;
	private Boolean advanceBooking;
	private Boolean bookingCanclled;
	private LocalDate createDate;
	private String createBy;
	private LocalDate updateDate;
	private String updatedBy;

}
