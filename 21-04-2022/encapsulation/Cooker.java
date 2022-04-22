package com.suhas.encapsulation;

public class Cooker {

	private String companyName;
	private int capacity;
	private double price;
	private String material;
	private int warranty;
	private double weight;
	private double height;
	private boolean isiMarked;
	private String manufacturedDate;
	private double discountPercentage;
	private boolean freeItem;
	Type type;
	
	public String getCompanyName() 
	{
		return companyName;
	}
	public void setCompanyName(String companyName)
	{
		this.companyName = companyName;
	}
	public int getCapacity()
	{
		return capacity;
	}
	public void setCapacity(int capacity)
	{
		this.capacity = capacity;
	}
	public double getPrice()
	{
		return price;
	}
	public void setPrice(double price) 
	{
		this.price = price;
	}
	public String getMaterial() 
	{
		return material;
	}
	public void setMaterial(String material)
	{
		this.material = material;
	}
	public int getWarranty()
	{
		return warranty;
	}
	public void setWarranty(int warranty) 
	{
		this.warranty = warranty;
	}
	public double getWeight()
	{
		return weight;
	}
	public void setWeight(double weight)
	{
		this.weight = weight;
	}
	public double getHeight()
	{
		return height;
	}
	public void setHeight(double height) 
	{
		this.height = height;
	}
	public boolean isIsiMarked()
	{
		return isiMarked;
	}
	public void setIsiMarked(boolean isiMarked) 
	{
		this.isiMarked = isiMarked;
	}
	public String getManufacturedDate() 
	{
		return manufacturedDate;
	}
	public void setManufacturedDate(String manufacturedDate)
	{
		this.manufacturedDate = manufacturedDate;
	}
	public double getDiscountPercentage()
	{
		return discountPercentage;
	}
	public void setDiscountPercentage(double discountPercentage) 
	{
		this.discountPercentage = discountPercentage;
	}
	public boolean isFreeItem() 
	{
		return freeItem;
	}
	public void setFreeItem(boolean freeItem)
	{
		this.freeItem = freeItem;
	}
	public Type getType()
	{
		return type;
	}
	public void setType(Type type)
	{
		this.type = type;
	}
	
}
