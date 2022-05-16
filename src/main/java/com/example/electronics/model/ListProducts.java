package com.example.electronics.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString 
@AllArgsConstructor
@NoArgsConstructor
@Entity(name="electronics")
public class ListProducts {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private int product_id;
	
	private String product_name;
	
	private String category;
	
	private String brand;
	
	private int price;
	
	private String image_url;
	
	private String specification;
	

}
