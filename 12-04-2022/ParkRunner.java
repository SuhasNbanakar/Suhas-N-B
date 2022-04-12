class ParkRunner
{
	public static void main(String[] args)
	{
		Park ticket=new Park();
		ticket.name="Freedom";
	    ticket.noOfTrees=45;
	    ticket.solarPowered=26;
		
		System.out.println(ticket.name);
	    System.out.println(ticket.noOfTrees);
	    System.out.println(ticket.solarPowered);
		
		System.out.println("*************CubbonPark****************");
		
		Park ticket1=new CubbonPark();
		ticket1.name="Butterfly";
	    ticket1.noOfTrees=100;
	    ticket1.solarPowered=38;
		
		System.out.println(ticket1.name);
	    System.out.println(ticket1.noOfTrees);
	    System.out.println(ticket1.solarPowered);
		
		
		CubbonPark casting=(CubbonPark)ticket1;
		casting.petsAllowed=true;
		System.out.println(casting.petsAllowed);
		
		System.out.println("************JinkePark*****************");
		
		Park ticket2=new JinkePark();
		ticket2.name="BBMP";
	    ticket2.noOfTrees=110;
	    ticket2.solarPowered=43;
		
		System.out.println(ticket2.name);
	    System.out.println(ticket2.noOfTrees);
	    System.out.println(ticket2.solarPowered);
		
		JinkePark casting2=(JinkePark)ticket2;
		casting2.couplesAllowed=false;
		System.out.println(casting2.couplesAllowed);
		
		
		
		
		
	}
}