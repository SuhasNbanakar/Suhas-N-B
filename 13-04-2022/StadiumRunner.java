class StadiumRunner{

	public static void main(String[] agrs){
		
		Stadium s1=new Stadium();
		s1.name="Chinnaswamy";
		s1.type="OutDoor";
		s1.noOfSeat=20000;
		System.out.println(s1.name);
		System.out.println(s1.type);
		System.out.println(s1.noOfSeat);
		s1.openGate();
		s1.openGate(true);
		
		System.out.println("*************************************");
		
		Stadium s2=new InDoorStadium();
		
		s2.name="Kanteerava";
		s2.type="Indoor";
		s2.noOfSeat=4000;
		System.out.println(s2.name);
		System.out.println(s2.type);
		System.out.println(s2.noOfSeat);
		s2.openGate();
		s2.openGate(false);
	}


}