package com.suhas.encapsulation;

public class Atm {
	
	private String bankName;
	private boolean securityGuard;
	private boolean ac;
	private double moneyAvailable;
	private String homeBranch;
	
	public String getBankName()
	{
		return bankName;
	}
	public void setBankName(String bankName) 
	{
		this.bankName = bankName;
	}
	public boolean isSecurityGuard()
	{
		return securityGuard;
	}
	public void setSecurityGuard(boolean securityGuard) 
	{
		this.securityGuard = securityGuard;
	}
	public boolean isAc() 
	{
		return ac;
	}
	public void setAc(boolean ac)
	{
		this.ac = ac;
	}
	public double getMoneyAvailable()
	{
		return moneyAvailable;
	}
	public void setMoneyAvailable(double moneyAvailable)
	{
		this.moneyAvailable = moneyAvailable;
	}
	public String getHomeBranch() 
	{
		return homeBranch;
	}
	public void setHomeBranch(String homeBranch) 
	{
		this.homeBranch = homeBranch;
	}
	
	
}
