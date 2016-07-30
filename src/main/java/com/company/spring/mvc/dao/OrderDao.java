package com.company.spring.mvc.dao;

import com.company.spring.mvc.model.Order;

import java.util.List;

/**
 * Created by Yevhen on 06.06.2016.
 */
public interface OrderDao {

    void save(Order order);

    List<Order> findAllOrders();

    void removeAll();
}
