class Offer{
	String name;
	double duration;
	
	Offer(String name,double duration)
	{
		this.name=name;
		this.duration=duration;
	}
	
	void discount(int amount)
	{
		if(amount>2000)
		{
			System.out.println("Discount is apply \t"+amount);
		}
		else
		{
			System.out.println("Discount is not apply \t"+amount);
		}	
	}
	
	void redeemPoints(int point)
	{
		if(point>10)
		{
			System.out.println("Point is apply to Discount item \t"+point);
		}
		else
		{
			System.out.println("Point is not apply to Discount item \t"+point);
		}		
	}
}