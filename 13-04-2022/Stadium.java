class Stadium{

	String name;
	String type;
	int noOfSeat;
	
	void openGate()
	{
		System.out.println("Runnig openGate");
	}
	void openGate(boolean open)
	{
		if(open)
		{
			System.out.println("Stadium Gate opend : "+this.name);
		}
		else
		{
			System.out.println("Stadium Gate closed : "+this.name);
		}
	}
}