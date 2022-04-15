class CyberShop{

	int since;
	String ownerName;
	int noOfSystems;
	
	CyberShop()
	{
		System.out.println("Runnig shop");
	}
	CyberShop(int since,String ownerName,int noOfSystems)
	{
		this.since=since;
		this.ownerName=ownerName;
		this.noOfSystems=noOfSystems;
	}
	void open(boolean shopOpen)
	{
		if(shopOpen)
		{
			System.out.println("Running Shop is open");
		}
	}
	
	void close(boolean shopClose)
	{
		if(shopClose)
		{
			System.out.println("sorry boss shop is close you come next time");
		}
	}
	void connectToInternet(boolean available)
	{
		if(available)
		{
			System.out.println("System connectToInternet"+available);
		}
		else
		{
			System.out.println("System con't connectToInternet"+available);
		}
	}
	
	
}