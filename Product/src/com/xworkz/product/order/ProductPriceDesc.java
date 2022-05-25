package com.xworkz.product.order;

import java.util.Comparator;

import com.xworkz.product.dto.ProductDTO;

public class ProductPriceDesc implements Comparator<ProductDTO> {

	@Override
	public int compare(ProductDTO o1, ProductDTO o2) {
		Double pri = o1.getPrice();
		Double pri1 = o2.getPrice();
		return pri1.compareTo(pri);
	}

}
