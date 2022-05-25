package com.xworkz.product.order;

import java.util.Comparator;

import com.xworkz.product.dto.ProductDTO;

public class ProductQualityAsc implements Comparator<ProductDTO> {

	@Override
	public int compare(ProductDTO o1, ProductDTO o2) {
		Float qua = o1.getQuality();
		Float qua1 = o2.getQuality();
		return qua.compareTo(qua1);
	}

}
