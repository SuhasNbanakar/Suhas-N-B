class Shop{

	void run(CyberShop cyberShop)
	{
		System.out.println("Running cyberShop : cyberShop");
		if(cyberShop instanceof CyberShop)
		{
			System.out.println(cyberShop.since);
			System.out.println(cyberShop.ownerName);
			System.out.println(cyberShop.noOfSystems);
			System.out.println("*****************");
		}
		if(cyberShop instanceof TechZoneCyberShop)
		{
			TechZoneCyberShop shop=(TechZoneCyberShop)cyberShop;
			shop.printing();
			System.out.println("*****************");
		}
		if(cyberShop instanceof SatyaCyberShop)
		{
			SatyaCyberShop shop1=(SatyaCyberShop)cyberShop;
			shop1.lamination();
			System.out.println("*****************");
		}
		
	}


}