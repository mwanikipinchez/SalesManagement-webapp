package com.bytetech.SalesManagementwebapp.service;

import com.bytetech.SalesManagementwebapp.Model.Product;

import java.util.List;

public interface ProductService {
    List<Product> findAllProduct();
    Product searchProduct(String name);
    Product saveProduct(Product product);
    Product updateProduct(String name, Product product);
    String deleteProduct(String name);
}
