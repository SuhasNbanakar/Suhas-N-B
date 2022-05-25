package com.xworkz.product.order;

import java.util.Comparator;

import com.xworkz.product.dto.ProductDTO;

public class ProductIdDescComp implements Comparator<ProductDTO> {

	@Override
	public int compare(ProductDTO o1, ProductDTO o2) {
		Integer id3 = o1.getId();
		Integer id4 = o2.getId();

		return id4.compareTo(id3);
	}

}
