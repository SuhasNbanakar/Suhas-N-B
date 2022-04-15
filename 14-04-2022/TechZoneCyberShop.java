class TechZoneCyberShop extends CyberShop{
	@overriding//anottion
	void printing()
	{
		System.out println("Running printing");
		super.since=1996;
		super.ownerName="Shivu";
		super.noOfSystems=20;
		this.connectToInternet(true);
	}
	}
	void connectToInternet(boolean Internetavailable)
	{
		if(Internetavailable)
		{
			System.out.println("System connectToInternet"+Internetavailable);
		}
		else
		{
			System.out.println("System con't connectToInternet"+Internetavailable);
		}
	}
}