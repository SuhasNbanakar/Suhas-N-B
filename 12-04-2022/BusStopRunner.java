class BusStopRunner{
	public static void main(String[] agrs){
	
	BusStop stop=new BusStop();
	stop.name="BTM";
	stop.busNos=new String[3];
	stop.busNos[0]="500A";
	stop.busNos[1]="25R";
	stop.noOfSeat=15;
	System.out.println(stop.name);
	System.out.println(stop.busNos[0]);
	System.out.println(stop.busNos[1]);
	System.out.println(stop.noOfSeat);
	
	System.out.println("**************Govt*******************");
	
	BusStop stop1=new GovtBusStop();
	stop1.name="Rajajinagar";
	stop1.busNos=new String[3];
	stop1.busNos[0]="500B";
	stop1.busNos[1]="24A";
	stop1.noOfSeat=10;
	System.out.println(stop1.name);
	System.out.println(stop1.busNos[0]);
	System.out.println(stop1.busNos[1]);
	System.out.println(stop1.noOfSeat);
	
	GovtBusStop temp=(GovtBusStop)stop1;
	temp.inagruatedBy="Aishwarya";
	System.out.println(temp.inagruatedBy);
	
	
	System.out.println("**************private*******************");
	
	BusStop stop2=new PrivateBusStop();
	stop2.name="Jaideva";
	stop2.busNos=new String[3];
	stop2.busNos[0]="26B";
	stop2.busNos[1]="20A";
	stop2.noOfSeat=120;
	System.out.println(stop2.name);
	System.out.println(stop2.busNos[0]);
	System.out.println(stop2.busNos[1]);
	System.out.println(stop2.noOfSeat);
	
	PrivateBusStop temp1=(PrivateBusStop)stop2;
	temp1.ac=true;
	System.out.println(temp1.ac);
	
	

	
	
	
	
	
	
	
	
	
	}




}