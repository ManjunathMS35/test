package edu.esprit.app.service;

import java.util.List;

import edu.esprit.app.entities.Product;

public interface ICatalogService {

	public void addProduct(Product p);
	public List<Product> getAllProducts();
	public List<Product> getAllProductByCriteria(String criteria);
	public Product getProductByReference(String ref);
	public void deleteProduct(String ref);
	public void updateProduct(Product p);
}
