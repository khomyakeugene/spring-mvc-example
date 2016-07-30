package com.company.spring.mvc.dao.hibernate;

import com.company.spring.mvc.dao.OrderDao;
import com.company.spring.mvc.model.Order;
import org.hibernate.SessionFactory;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Yevhen on 06.06.2016.
 */
public class HOrderDao implements OrderDao {
    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Transactional
    @Override
    public void save(Order order) {
        sessionFactory.getCurrentSession().save(order);
    }

    @Transactional
    @Override
    public List<Order> findAllOrders() {
        return sessionFactory.getCurrentSession().createQuery("SELECT o FROM Order o", Order.class).list();
    }

    @Transactional
    @Override
    public void removeAll() {
        sessionFactory.getCurrentSession().createQuery("DELETE FROM Order").executeUpdate();
    }
}
