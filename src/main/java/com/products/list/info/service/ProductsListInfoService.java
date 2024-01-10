package com.products.list.info.service;

import java.io.File;
import java.io.IOException;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.products.list.info.model.ProductsResponse;

@Service
public class ProductsListInfoService {
	
	public ProductsListInfoService() {
		
	}
	
	public ProductsResponse getProductsResponse() throws IOException {
		return new ObjectMapper().readValue(new File("src/main/resources/mock/products.json"), ProductsResponse.class);
	}
}
