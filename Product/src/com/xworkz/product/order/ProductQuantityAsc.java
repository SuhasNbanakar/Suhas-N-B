package com.xworkz.product.order;

import java.util.Comparator;

import com.xworkz.product.dto.ProductDTO;

public class ProductQuantityAsc implements Comparator<ProductDTO> {

	@Override
	public int compare(ProductDTO o1, ProductDTO o2) {
		Integer quan = o1.getQuantity();
		Integer quan1 = o2.getQuantity();
		return quan.compareTo(quan1);
	}

}
