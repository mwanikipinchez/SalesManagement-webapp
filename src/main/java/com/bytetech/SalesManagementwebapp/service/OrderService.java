package com.bytetech.SalesManagementwebapp.service;

import com.bytetech.SalesManagementwebapp.Model.Order;


import java.util.List;

public interface OrderService {
    List<Order> findAllOrder();
    Order searchOrder(String name);
    Order saveOrder(Order order);
    Order updateOrder(String name, Order order);
    String deleteOrder(String name);
}
