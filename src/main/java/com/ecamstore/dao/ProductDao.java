package com.ecamstore.dao;

import com.ecamstore.model.Product;

import java.util.List;

/**
 * Created by Yuth on 12/5/2016.
 */
public interface ProductDao {

    void addProduct(Product product);
    void editProduct(Product product);
    Product getProductById(String id);
    List<Product> getAllProducts();
    void deleteProduct(String id);
}
