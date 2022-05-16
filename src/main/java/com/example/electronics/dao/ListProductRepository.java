package com.example.electronics.dao;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.example.electronics.model.ListProducts;


@Repository
public interface ListProductRepository extends JpaRepository<ListProducts,Integer>{

	List<ListProducts> findAll();
	
}
