package com.company.spring.mvc.dao.hibernate;

import com.company.spring.mvc.dao.DishDao;
import com.company.spring.mvc.model.Dish;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Yevhen on 06.06.2016.
 */
public class HDishDao implements DishDao {
    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Transactional
    @Override
    public void save(Dish dish) {
        sessionFactory.getCurrentSession().save(dish);
    }

    @Transactional
    @Override
    public List<Dish> findAll() {
        return sessionFactory.getCurrentSession().createQuery("SELECT d FROM Dish d ORDER BY id", Dish.class).list();
    }

    @Transactional
    @Override
    public Dish findByName(String name) {
        Query<Dish> query = sessionFactory.getCurrentSession().createQuery("FROM Dish WHERE name like :name", Dish.class);
        query.setParameter("name", name);

        return query.uniqueResult();
    }

    @Transactional
    @Override
    public void removeAll() {
        sessionFactory.getCurrentSession().createQuery("DELETE FROM Dish").executeUpdate();
    }
}
