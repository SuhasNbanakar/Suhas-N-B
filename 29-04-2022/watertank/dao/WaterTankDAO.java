package com.xwork.watertank.dao;

import com.xwork.watertank.dto.WaterTankDTO;

public class WaterTankDAO {
	private int index;
	private WaterTankDTO[] dtos=new WaterTankDTO[5];
		
	public boolean save(WaterTankDTO dto)
	{
		System.out.println("calling the save method adding the dto = "+dto);
		System.out.println("hash code = "+dto.hashCode());
		if(index<this.dtos.length)
		{
			this.dtos[index]=dto;	
			index++;
			System.out.println("new tank added "+index);
			return true;
		}
		else
		{
			System.out.println("no new tank added");
		}
		return false;
	}

}

