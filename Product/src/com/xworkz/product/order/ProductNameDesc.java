package com.xworkz.product.order;

import java.util.Comparator;

import com.xworkz.product.dto.ProductDTO;

public class ProductNameDesc implements Comparator<ProductDTO> {

	@Override
	public int compare(ProductDTO o1, ProductDTO o2) {
		String nam = o1.getName();
		String nam1 = o2.getName();
		return nam1.compareTo(nam);
	}

}
