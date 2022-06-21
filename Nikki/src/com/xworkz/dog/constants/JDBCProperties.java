package com.xworkz.dog.constants;

public enum JDBCProperties {

	URL("jdbc:mysql://localhost:3306/Shivamogga"), USERNAME("root"), SECRET("Xworkzodc@123");

	private String value;

	private JDBCProperties(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}
}
