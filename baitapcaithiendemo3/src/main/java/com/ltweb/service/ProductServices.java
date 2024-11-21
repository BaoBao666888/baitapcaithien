package com.ltweb.service;

import java.util.List;

import com.ltweb.entity.Product;

public interface ProductServices {

	void delete(Long id);

	Product get(Long id);

	Product save(Product product);

	List<Product> listAll();

}
