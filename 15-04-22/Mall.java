class Mall{

	void shopping(Offer offer)
	{
		System.out.println("running Shopping : offer");
		if(offer instanceof Offer)
		{
			System.out.println(offer.name);
			System.out.println(offer.duration);
			offer.discount(2500);
			offer.redeemPoints(13);
			System.out.println("details of offer");
		}
		if(offer instanceof SuperOffer)
		{
			SuperOffer sup=(SuperOffer)offer;
			System.out.println(sup.holiday);
			System.out.println("details of superoffer");
		}
		if(offer instanceof BumperOffer)
		{
			BumperOffer bup=(BumperOffer)offer;
			System.out.println(bup.item);
			System.out.println("details of Bumperoffer");
		}
	}



}