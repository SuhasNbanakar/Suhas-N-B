class ShopRunner{

	public static void main(String[] agrs)
	{
		CyberShop s1=new CyberShop();
		s1.open(true);
		//CyberShop s2=new TechZoneCyberShop();
		//ss2.printing();
		
		
		Shop shop=new Shop();
		shop.run(s1);
		
	}



}