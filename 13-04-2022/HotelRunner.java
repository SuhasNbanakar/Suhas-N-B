class HotelRunner{

	public static void main(String[] agrs)
	{
		Hotel h1=new Hotel();
		h1.name="Udupi Hotel";
		h1.ownerName="Nagaraj";
		h1.since=1996;
		System.out.println(h1.name);
		System.out.println(h1.ownerName);
		System.out.println(h1.since);
		h1.serviceFood();
		h1.deliverFood(true);
		
		System.out.println("***************************");
		
		Hotel h2=new TajHotel();
		h2.name="Sudha Hotel";
		h2.ownerName="Sandeep";
		h2.since=2000;
		System.out.println(h2.name);
		System.out.println(h2.ownerName);
		System.out.println(h2.since);
		h2.serviceFood();
		h2.deliverFood(false);
	}


}