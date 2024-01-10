package com.products.list.info.model;

import java.io.Serializable;
import java.util.Collections;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ProductsResponse implements Serializable {
	
	@JsonProperty("products")
	private List<Product> products;

	public ProductsResponse() {
		this(Collections.EMPTY_LIST);
	}
	
	public ProductsResponse(List<Product> products) {
		this.products = products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

	public List<Product> getProducts() {
		return products;
	}
	
	

}
