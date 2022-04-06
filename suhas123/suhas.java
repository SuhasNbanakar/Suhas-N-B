class Stringtoprimitive{

	public static void main(String[] agrs)
	{
		String age="73"; //byte
		String busNo="401"; //short
		String sequnce="45000"; //int
		String mobileNo="8050319217"; //long
		String cost="45.0"; //float
		String price="12000.0"; //double
		String open="true"; //boolean
		String gender="F"; //char
		
		System.out.println("\n AGE");
		byte Age=Byte.valueOf(age);
		System.out.println("age "+Age);
		byte Age1=Byte.parseByte(age);
		System.out.println("age "+Age1);
		byte Age2=Byte.decode(age);
		System.out.println("age "+Age2);
		Byte b1=new Byte(age);
		System.out.println("age "+b1);
		Byte b2=new Byte((byte)26);
		System.out.println("age "+b2);
		
		System.out.println("\n BUS");
		short BusNo=Short.valueOf(busNo);
		System.out.println("busNo "+BusNo);
		short BusNo1=Short.parseShort(busNo);
		System.out.println("busNo "+BusNo1);
		short BusNo2=Short.decode(busNo);
		System.out.println("busNo "+BusNo2);
		Short s1=new Short(age);
		System.out.println("busNo "+s1);
		Short s2=new Short((short)123);
		System.out.println("busNo "+s2);
		
		System.out.println("\n SEQUNCE");
		int Sequnce=Integer.valueOf(sequnce);
		System.out.println("sequnce "+Sequnce);
		int Sequnce1=Integer.parseInt(sequnce);
		System.out.println("sequnce "+Sequnce1);
		int Sequnce2=Integer.getInteger(sequnce,45000);
		System.out.println("sequnce "+Sequnce2);
		int Sequnce3=Integer.lowestOneBit(4500);
		System.out.println("sequnce "+Sequnce3);
		int Sequnce4=Integer.numberOfLeadingZeros(4500);
		System.out.println("sequnce "+Sequnce4);
		
		System.out.println("\n MOBILENUMBER");
		long MobileNo=Long.valueOf(mobileNo);
		System.out.println("mobileNo "+MobileNo);
		long MobileNo1=Long.parseLong(mobileNo);
		System.out.println("mobileNo "+MobileNo1);
		long MobileNo2=Long.decode(mobileNo);
		System.out.println("mobileNo "+MobileNo2);
		long MobileNo3=Long.getLong(mobileNo,80503192);
		System.out.println("mobileNo "+MobileNo3);
		long MobileNo4=Long.lowestOneBit(80503192);
		System.out.println("mobileNo "+MobileNo4);

		System.out.println("\n COST");
		String costb="35.0";
		float Cost=Float.valueOf(cost);
		System.out.println("cost "+Cost);
		float Cost1=Float.parseFloat(costb);
		System.out.println("cost "+Cost1);
		float Cost2=Float.max(Cost,Cost1);
		System.out.println("cost "+Cost1);
		float Cost3=Float.min(Cost,Cost1);
		System.out.println("cost "+Cost3);
		float Cost4=Float.sum(Cost,Cost1);
		System.out.println("cost "+Cost4);
		
		System.out.println("\n PRICE");
		String priceb="8000";
		double Price=Double.valueOf(price);
		System.out.println("price "+Price);
		double Price1=Double.parseDouble(priceb);
		System.out.println("price "+Price1);
		double Price2=Double.max(Price,Price1);
		System.out.println("price "+Price2);
		double Price3=Double.min(Price,Price1);
		System.out.println("price "+Price3);
		double Price4=Double.sum(Price,Price1);
		System.out.println("price "+Price4);
		
		System.out.println("\n OPEN");
		boolean Open=Boolean.valueOf(open);
		System.out.println("open "+Open);
		boolean Open1=Boolean.parseBoolean(open);
		System.out.println("open "+Open1);
		boolean Open2=Boolean.getBoolean(open);
		System.out.println("open "+Open2);
		
		
		System.out.println("\n GENDER");
		char Gender=gender.charAt(0);
		System.out.println("gender "+gender);
		
		
		
	}

}