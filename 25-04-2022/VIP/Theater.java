package com.xwork.method;

public class Theater {

	private	String name;
	private	String movieName;
	private	String location;
	private	int ticketPrice;
	
	

	public int hashCode() 
	{
		System.out.println("running hashCode");
		return 400;//fulli valid code is use return super.hasCode()
	}
	
	public String toString() 
	{
		System.out.println("running tostring");
		return "Theater";//fulli valid code is use return super.toString()
	}
	
	
	public boolean equals(Object temp) 
	{
		System.out.println("running equals");
		if(temp !=null)
		{
			System.out.println("runnig theater is not null");
			if(temp instanceof Theater)
			{
				System.out.println("runnig insatance theater");
				Theater theater=(Theater)temp;
				if(this.name.equals(theater.name) 
						&& this.location.equals(theater.location))
				{
					System.out.println("runnig theater is open");
					return true;
				}
				
			}
			else
			{
				System.out.println("theater is close you go and sleep");
			}
		}
		
		
		return false;
	}
	
		
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public int getTicketPrice() {
		return ticketPrice;
	}
	public void setTicketPrice(int ticketPrice) {
		this.ticketPrice = ticketPrice;
	}
	
	
	
}
