class ShopRunner{

	public static void main(String[] agrs)
	{
		Shop shop3=new Shop();
		CyberShop sh=new CyberShop(1997,"Suhas",20);
		shop3.run(sh);
		sh.open(true);
		sh.close(true);
		
		TechZoneCyberShop sh1=new TechZoneCyberShop(1996,"pratheek",30);
		shop3.run(sh1);
		sh1.connectToInternet(true);
			
		SatyaCyberShop sh2=new SatyaCyberShop(1999,"Shivu",15);
		shop3.run(sh2);
	}



}