package com.bytetech.SalesManagementwebapp.ServiceImpl;

import com.bytetech.SalesManagementwebapp.Model.Order;
import com.bytetech.SalesManagementwebapp.repository.OrderRepository;
import com.bytetech.SalesManagementwebapp.service.OrderService;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class OrderServiceImpl implements OrderService {
    private OrderRepository orderRepository;

    public OrderServiceImpl(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @Override
    public List<Order> findAllOrder() {
        return orderRepository.findAll();
    }

    @Override
    public Order searchOrder(String name) {
        Order order = orderRepository.findByName(name);
        if(order != null) {
            return order;
        }
        return null;
    }

    @Override
    public Order saveOrder(Order order) {
        return orderRepository.save(order);
    }

    @Override
    public Order updateOrder(String name, Order order) {
        Order existing = orderRepository.findByName(name);
        existing.setDateOrdered(order.getDateOrdered());
        existing.setOrderedBy(order.getOrderedBy());
        existing.setSupplier(order.getSupplier());
        existing.setProductsToOrder(order.getProductsToOrder());
        existing.setName(order.getName());
        return existing;
    }

    @Override
    public String deleteOrder(String name) {
        Order deleted = orderRepository.findByName(name);
        if(deleted != null){
            orderRepository.deleteById(deleted.getId());
            return "Deleted Successfully";
        }
        return "No such order exist";
    }
}
