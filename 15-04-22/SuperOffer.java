class SuperOffer extends Offer{

	boolean holiday;
	
	SuperOffer(String name,double duration,boolean holiday)
	{
		super(name,duration);
		if(holiday)
		{
			System.out.println("Today is holiday");
		}
		else
		{
			System.out.println("Today is working day");
		}
	}
	
	void totalCost(double cost)
	{
		System.out.println("Totalcost : "+cost);	
		
	}

}