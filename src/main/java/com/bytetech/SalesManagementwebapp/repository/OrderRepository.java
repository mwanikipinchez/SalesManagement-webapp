package com.bytetech.SalesManagementwebapp.repository;

import com.bytetech.SalesManagementwebapp.Model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
    Order findByName(String name);

}
