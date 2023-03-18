package com.bytetech.SalesManagementwebapp.repository;

import com.bytetech.SalesManagementwebapp.Model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
    Product findByName(String name);


}
