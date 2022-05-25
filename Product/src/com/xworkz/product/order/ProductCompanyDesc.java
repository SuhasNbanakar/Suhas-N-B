package com.xworkz.product.order;

import java.util.Comparator;

import com.xworkz.product.dto.ProductDTO;

public class ProductCompanyDesc implements Comparator<ProductDTO> {

	@Override
	public int compare(ProductDTO o1, ProductDTO o2) {
		String com = o1.getCompany();
		String com1 = o2.getCompany();
		return com1.compareTo(com);
	}

}
