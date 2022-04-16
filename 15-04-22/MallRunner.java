class MallRunner{

	public static void main(String[] agrs)
	{
		Mall mall=new Mall();
		Offer off=new Offer("Home Appliances",24);
		mall.shopping(off);
		System.out.println(off.name);
		System.out.println(off.duration);
		
		SuperOffer off1=new SuperOffer("tv",12,true);
		off1.totalCost(30000);
		mall.shopping(off1);
		
		BumperOffer off3=new BumperOffer("phone",10,"iPhone");
		off3.member(true);
		mall.shopping(off3);
	
	
	
	
	}


}