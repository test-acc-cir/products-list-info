package com.products.list.info.controller;

import java.io.IOException;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.products.list.info.model.ProductsResponse;
import com.products.list.info.service.ProductsListInfoService;

@RestController
@RequestMapping("/v1")
public class ProductsListInfoController {
	
	private final ProductsListInfoService productsListInfoService; 
	
	public ProductsListInfoController(final ProductsListInfoService productsListInfoService) {
		this.productsListInfoService = productsListInfoService;
	}
	
	@GetMapping(value = "/hello", produces = {"application/json"})
	public String helloWorld() {
		return "Hello world";
	}
	
	@GetMapping(value = "/getProductsList", produces = {"application/json"})
	public ProductsResponse getProductsList() {
		try {
			return productsListInfoService.getProductsResponse();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
