package com.lambdaschool.javaorders.services;

import com.lambdaschool.javaorders.models.Order;
import com.lambdaschool.javaorders.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;

@Service(value = "orderService")
public class OrderServiceImpl implements OrderService{

    @Autowired
    private OrderRepository orderrepo;

    @Override
    public Order findOrderById(long id) {
        return orderrepo.findById(id).orElseThrow(() ->
                new EntityNotFoundException(Long.toString(id)));
    }
}