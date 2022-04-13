class Hotel{

	String name;
	String ownerName;
	int since;
	
	void serviceFood()
	{
		System.out.println("Running serviceFood");
	}
	void deliverFood(boolean available)
	{
		if(available)
		{
			System.out.println("Food available : "+this.name);
		}
		else
		{
			System.out.println("Food not available : "+this.name);
		}
		
		
	}


}