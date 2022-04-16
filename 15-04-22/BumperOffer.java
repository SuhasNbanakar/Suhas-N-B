class BumperOffer extends Offer{

	String item;
	
	BumperOffer(String name,double duration,String item)
	{
		super(name,duration);
		this.item=item;
	}
	
	void member(boolean peoples)
	{
		if(peoples)
		{
			System.out.println("running member ");
		}
		else
		{
			System.out.println("running not member  ");
		}
	}

}