package com.products.list.info.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

public class Product implements Serializable {
	
	@JsonProperty("type")
	private String type;
	
	@JsonProperty("name")
	private String name;
	
	@JsonProperty("productCode")
	private String productCode;
	
	@JsonProperty("price")
	private String price;

	public Product() {
		this(null, null, null, null);
	}

	public Product(String type, String name, String productCode, String price) {
		this.type = type;
		this.name = name;
		this.productCode = productCode;
		this.price = price;
	}

	public Product(String type) {
		this.type = type;
	}

	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getProductCode() {
		return productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	
}
