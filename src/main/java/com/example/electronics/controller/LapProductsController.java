package com.example.electronics.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.electronics.dao.ListProductRepository;
import com.example.electronics.model.ListProducts;



@RestController
public class LapProductsController {
	
	@Autowired
	ListProductRepository Repository;
	
	@GetMapping("listProduct/products")
	public List<ListProducts> findAllLapProducts() {
		try {
			List<ListProducts> productList = Repository.findAll();
			return productList;
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
			return null;
		}
		
				
	}
}
