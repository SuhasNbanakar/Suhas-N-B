package com.equals.method;

public class Mall {
	
	private int mallNumber;
	private String name;
	private String ownerName;
	private Integer pincode;
	private boolean pvr;
	
	public boolean equals(Object suhas)
	{
		if(suhas !=null)
		{
			System.out.println("running object suhas");
			if(suhas instanceof Mall)
			{
				System.out.println("running instance of suhas");
				Mall ban=(Mall)suhas;
				if(this.name.equals(ban.name) && this.pincode.equals(ban.pincode))
				{
					System.out.println("running mall is open");
					return true;
				}
			}
		}
		else
		{
			System.out.println("mall is colse boss u come next day");
			return false;
		}
		return false;
	}
	

	public int getMallNumber() {
		return mallNumber;
	}
	public void setMallNumber(int mallNumber) {
		this.mallNumber = mallNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	public Integer getPincode() {
		return pincode;
	}
	public void setPincode(Integer pincode) {
		this.pincode = pincode;
	}
	public boolean isPvr() {
		return pvr;
	}
	public void setPvr(boolean pvr) {
		this.pvr = pvr;
	}
	

}
